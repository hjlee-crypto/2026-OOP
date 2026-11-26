package rental.model;

// 일반자전거: 기본 1,000원 + 분당 100원. 배터리가 없다.
public class Bicycle extends Vehicle {
    private static final int BASE_FEE = 1000;
    private static final int FEE_PER_MINUTE = 100;

    public Bicycle(String id) {
        super(id);
    }

    @Override
    public String typeName() {
        return "일반자전거";
    }

    @Override
    public int calculateFee(int minutes) {
        return BASE_FEE + FEE_PER_MINUTE * minutes;
    }
}
