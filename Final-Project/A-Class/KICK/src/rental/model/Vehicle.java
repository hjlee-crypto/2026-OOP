package rental.model;

// 모든 기기의 공통 부모 (추상 클래스)
public abstract class Vehicle {
    private final String id;        // 기기 번호
    private boolean rented;         // 대여 중이면 true

    public Vehicle(String id) {
        this.id = id;
    }

    // 기기마다 요금 계산 방식이 달라서 자식 클래스가 구현한다
    public abstract int calculateFee(int minutes);

    public abstract String typeName();

    public void rent() { rented = true; }

    public void giveBack() { rented = false; }

    public String getId() { return id; }

    public boolean isRented() { return rented; }

    @Override
    public String toString() {
        return "[" + typeName() + "] " + id + (rented ? " (대여 중)" : " (대여 가능)");
    }
}
