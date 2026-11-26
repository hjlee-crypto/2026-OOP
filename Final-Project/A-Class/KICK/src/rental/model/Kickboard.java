package rental.model;

// 전동킥보드: 잠금해제 1200원 + 분당 180원
// 1차 버전: 배터리를 킥보드 안에 직접 둠 (11주차에 ElectricVehicle·Chargeable로 분리 예정)
public class Kickboard extends Vehicle {
    private int battery;

    public Kickboard(String id, int battery) {
        super(id);
        this.battery = battery;
    }

    @Override
    public int calculateFee(int minutes) {
        return 1200 + 180 * minutes;
    }

    @Override
    public String typeName() { return "전동킥보드"; }

    public int getBattery() { return battery; }

    @Override
    public String toString() {
        return super.toString() + " 배터리 " + battery + "%";
    }
}
