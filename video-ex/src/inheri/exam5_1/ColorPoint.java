package inheri.exam5_1;

public class ColorPoint extends Point{
    private String colorStr; // 점의 색
    public void setColorStr(String colorStr) {
        this.colorStr = colorStr;
    }
    public String getColorStr(){
        return this.colorStr;
    }
    /*public void set(int x, int y) {// setter
        // 매개변수 x, y가 받은 데이터를 검증해서 대입할 것인지 판단
        //this.x = x; this.y = y;
        setX(x);
        setY(y);
    }*/


    public void showColorPoint() { // 컬러 점의 좌표 출력
        System.out.println("ColorPoint클래스의 showColorPoint() 호출: "+colorStr);
        System.out.println("ColorPoint클래스의 showColorPoint() 메서드 안에서 기초클래스의 showPoint() 호출함 ");
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}
