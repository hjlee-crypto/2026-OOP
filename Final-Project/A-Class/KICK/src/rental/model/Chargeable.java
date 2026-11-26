package rental.model;

// 배터리가 있어서 충전할 수 있는 기기의 규약 (인터페이스)
// 일반자전거는 구현하지 않는다.
public interface Chargeable {
    int MIN_BATTERY = 20;   // 대여 가능한 최소 배터리(%)
    int FULL_BATTERY = 100;

    int getBattery();

    void charge();
}
