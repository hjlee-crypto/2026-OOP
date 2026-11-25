package rental.exception;

// 대여 시스템에서 발생하는 모든 업무 오류의 부모 예외
public class RentalException extends RuntimeException {
    public RentalException(String message) {
        super(message);
    }
}
