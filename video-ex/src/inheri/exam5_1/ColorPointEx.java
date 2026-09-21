package inheri.exam5_1;

public class ColorPointEx {
    public static void main(String [] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1, 2); // Point 클래스의 set(int x, int y) 호출
        p.showPoint();
        System.out.println("--------------------");
        ColorPoint cp = new ColorPoint(); // ColorPoint 객체
        cp.set(3, 4); // Point의 set() 호출
        cp.setColorStr("red"); // ColorPoint의 setColorStr() 호출
        cp.showColorPoint(); // 컬러와 좌표 출력
    }
}
