package rental.exception;

// 이미 대여 중인 기기를 빌리려 할 때
public class VehicleNotAvailableException extends RentalException {
    public VehicleNotAvailableException(String vehicleId) {
        super("이미 대여 중인 기기입니다: " + vehicleId);
    }
}
