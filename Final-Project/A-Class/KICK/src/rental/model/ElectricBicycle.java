package rental.model;

// 전기자전거: 기본 1,000원 + 분당 150원. 1분에 배터리 1% 사용.
public class ElectricBicycle extends ElectricVehicle {
    private static final int BASE_FEE = 1000;
    private static final int FEE_PER_MINUTE = 150;

    public ElectricBicycle(String id, int battery) {
        super(id, battery);
    }

    @Override
    public String typeName() {
        return "전기자전거";
    }

    @Override
    protected int usagePerMinute() {
        return 1;
    }

    @Override
    public int calculateFee(int minutes) {
        return BASE_FEE + FEE_PER_MINUTE * minutes;
    }
}
