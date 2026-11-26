package rental.model;

import rental.exception.LowBatteryException;

// 배터리가 있는 기기의 공통 부모 (추상 클래스)
// 전기자전거와 전동킥보드가 똑같이 쓰는 배터리 코드를 한 곳에 모았다.
public abstract class ElectricVehicle extends Vehicle implements Chargeable {
    private int battery;    // 0~100(%). charge()/giveBack()으로만 바뀐다

    protected ElectricVehicle(String id, int battery) {
        super(id);
        if (battery < 0 || battery > FULL_BATTERY) {
            throw new IllegalArgumentException("배터리는 0~100 사이여야 합니다: " + battery);
        }
        this.battery = battery;
    }

    // 1분 탈 때 줄어드는 배터리(%). 기기마다 다르다.
    protected abstract int usagePerMinute();

    @Override
    public int getBattery() {
        return battery;
    }

    @Override
    public void charge() {
        battery = FULL_BATTERY;
    }

    // 부모의 검사(대여 중인지)에 배터리 검사를 추가한다
    @Override
    public void checkRentable() {
        super.checkRentable();
        if (battery < MIN_BATTERY) {
            throw new LowBatteryException(getId(), battery, MIN_BATTERY);
        }
    }

    // 반납하면 탄 시간만큼 배터리가 줄어든다 (0 아래로는 내려가지 않음)
    @Override
    public void giveBack(int minutes) {
        super.giveBack(minutes);
        battery = Math.max(0, battery - usagePerMinute() * minutes);
    }

    @Override
    public String toString() {
        return super.toString() + " 배터리 " + battery + "%";
    }
}
