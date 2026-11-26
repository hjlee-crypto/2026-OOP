package rental.model;

import java.util.Objects;

// 회원. 한 번에 기기 한 대만 빌릴 수 있다.
public class Member {
    private final String id;
    private final String name;
    private Vehicle current;    // 지금 빌린 기기 (없으면 null)

    public Member(String id, String name) {
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

    public void startRental(Vehicle vehicle) {
        this.current = vehicle;
    }

    public void endRental() {
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
