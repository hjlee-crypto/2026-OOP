package rental.model;

// 일반자전거: 기본 1000원 + 분당 100원
public class Bicycle extends Vehicle {
    public Bicycle(String id) {
        super(id);
    }

    @Override
    public int calculateFee(int minutes) {
        return 1000 + 100 * minutes;
    }

    @Override
    public String typeName() { return "일반자전거"; }
}
