package rental.model;

import rental.exception.RentalException;

import java.util.Objects;

// 회원. 한 번에 기기 한 대만 빌릴 수 있다.
public class Member {
    private final String id;
    private final String name;
    private Vehicle current;    // 지금 빌린 기기 (없으면 null)

    public Member(String id, String name) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("회원번호를 입력하세요.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름을 입력하세요.");
        }
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Vehicle getCurrent() {
        return current;
    }

    public boolean isRenting() {
        return current != null;
    }

    // 대여 순서: RentalService가 vehicle.rent()를 먼저 부른 뒤 이 메소드를 부른다.
    // Member는 기기 상태를 바꾸지 않고, 순서가 맞는지만 확인한다.
    public void startRental(Vehicle vehicle) {
        if (isRenting()) {
            throw new RentalException(name + "님은 이미 " + current.getId() + " 기기를 대여 중입니다.");
        }
        if (!vehicle.isRented()) {      // 기기 대여 처리(배터리 검사 포함)를 건너뛴 호출은 거부
            throw new RentalException("대여 처리되지 않은 기기입니다: " + vehicle.getId());
        }
        this.current = vehicle;
    }

    // 반납 순서: RentalService가 vehicle.giveBack()을 먼저 부른 뒤 이 메소드를 부른다.
    public void endRental() {
        if (!isRenting()) {
            throw new RentalException(name + "님은 대여 중인 기기가 없습니다.");
        }
        if (current.isRented()) {       // 기기 반납 처리(배터리 감소·요금 계산)를 건너뛴 호출은 거부
            throw new RentalException("반납 처리되지 않은 기기입니다: " + current.getId());
        }
        this.current = null;
    }

    @Override
    public String toString() {
        return id + " " + name + (isRenting() ? " (대여 중: " + current.getId() + ")" : "");
    }

    // 회원번호가 같으면 같은 회원
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Member)) return false;
        Member other = (Member) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
