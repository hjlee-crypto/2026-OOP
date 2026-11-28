package rental.model;

import rental.exception.RentalException;

// 기기 종류 번호를 받아 알맞은 기기 객체를 만든다 (팩토리)
// 새 기기 종류가 생기면 화면(ConsoleUI)은 그대로 두고 이 클래스만 고치면 된다.
public class VehicleFactory {
    public static final String BICYCLE = "1";
    public static final String ELECTRIC_BICYCLE = "2";
    public static final String KICKBOARD = "3";

    // 객체를 만들 필요가 없는 도우미 클래스
    private VehicleFactory() {
    }

    // 종류 선택 메뉴에 보여줄 글
    public static String typeMenu() {
        return BICYCLE + ".일반자전거  " + ELECTRIC_BICYCLE + ".전기자전거  " + KICKBOARD + ".전동킥보드";
    }

    public static boolean isValidType(String type) {
        return BICYCLE.equals(type) || ELECTRIC_BICYCLE.equals(type) || KICKBOARD.equals(type);
    }

    // 배터리 값을 입력받아야 하는 종류인지
    public static boolean needsBattery(String type) {
        return ELECTRIC_BICYCLE.equals(type) || KICKBOARD.equals(type);
    }

    // 일반자전거는 battery 값을 쓰지 않는다
    public static Vehicle create(String type, String id, int battery) {
        switch (type) {
            case BICYCLE: return new Bicycle(id);
            case ELECTRIC_BICYCLE: return new ElectricBicycle(id, battery);
            case KICKBOARD: return new Kickboard(id, battery);
            default: throw new RentalException("알 수 없는 기기 종류입니다: " + type);
        }
    }
}
