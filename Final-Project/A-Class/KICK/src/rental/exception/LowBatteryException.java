package rental.exception;

// 배터리가 기준(20%)보다 낮은 전기 기기를 빌리려 할 때
public class LowBatteryException extends RentalException {
    public LowBatteryException(String vehicleId, int battery, int minBattery) {
        super("배터리가 부족합니다: " + vehicleId + " (현재 " + battery + "%, " + minBattery + "% 이상만 대여 가능)");
    }
}
