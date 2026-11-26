package rental.model;

// 전동킥보드: 잠금해제 1,200원 + 분당 180원. 1분에 배터리 2% 사용.
public class Kickboard extends ElectricVehicle {
    private static final int UNLOCK_FEE = 1200;
    private static final int FEE_PER_MINUTE = 180;

    public Kickboard(String id, int battery) {
        super(id, battery);
    }

    @Override
    public String typeName() {
        return "전동킥보드";
    }

    @Override
    protected int usagePerMinute() {
        return 2;
    }

    @Override
    public int calculateFee(int minutes) {
        return UNLOCK_FEE + FEE_PER_MINUTE * minutes;
    }
}
