package rental.exception;

// 없는 회원번호·기기번호를 입력했을 때
public class NotFoundException extends RentalException {
    public NotFoundException(String kind, String id) {
        super("등록되지 않은 " + kind + "입니다: " + id);
    }
}
