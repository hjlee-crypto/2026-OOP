package inheri.exam5_1;
public class Point {
    private int x, y; // 한 점을 구성하는 x, y 좌표
    public Point(){
        // 시스템 의 환경설정값들을 가져와서 , 모니터 의 좌표계
        x=5;// 중심좌표 x값을 넘겨준다
        y=5;
    }
    public Point(int x, int y){
        set(x, y);
    }
    public void set(int x, int y) {// setter
        // 매개변수 x, y가 받은 데이터를 검증해서 대입할 것인지 판단
        //this.x = x; this.y = y;
        setX(x);
        setY(y);
    }
    public int getX() {
        return x;
    }
    public int getX(int x) {
        // 매개변수 x가 받은 데이터에 의해서 멤버변수 x의 값을 리턴 할지 결정해서 리턴을 진행한다.
        return this.x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        // 실전에서는 매개변수 x가 받은 값을 판단하는 문장
        // 판단 결과에 따라서 매개변수가 받은 x의 값을
        // 멤버 변수 this.x 의 값으로 전달하는 과정을 작성
        // 만약, 허용할 수 없는 데이타를 x가 받았다면 exception을
        //  발생시켜서 문제가 발생되지 않도록 조치를 취하게 됩니다.
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void showPoint() { // 점의 좌표 출력
        System.out.println("Point 의showPoint() 호출됨 (" + x + "," + y + ")");
    }
}
