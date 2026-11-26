package rental.model;

import rental.exception.RentalException;
import rental.exception.VehicleNotAvailableException;

import java.util.Objects;

// 모든 대여 기기의 공통 부모 (추상 클래스)
public abstract class Vehicle {
    private final String id;    // 기기 번호 (바뀌지 않음)
    private boolean rented;     // 대여 중이면 true. rent()/giveBack()으로만 바뀐다

    protected Vehicle(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("기기번호를 입력하세요.");
        }
        this.id = id;
    }

    // 기기 종류 이름과 요금 계산은 기기마다 달라서 자식 클래스가 구현한다
    public abstract String typeName();

    public abstract int calculateFee(int minutes);

    // 대여할 수 있는 상태인지 검사한다. 문제가 있으면 예외를 던진다.
    public void checkRentable() {
        if (rented) {
            throw new VehicleNotAvailableException(id);
        }
    }

    public void rent() {
        checkRentable();
        rented = true;
    }

    public void giveBack(int minutes) {
        if (!rented) {
            throw new RentalException("대여 중이 아닌 기기입니다: " + id);
        }
        rented = false;
    }

    public String getId() {
        return id;
    }

    public boolean isRented() {
        return rented;
    }

    @Override
    public String toString() {
        return "[" + typeName() + "] " + id + (rented ? " (대여 중)" : " (대여 가능)");
    }

    // 기기 번호가 같으면 같은 기기
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
