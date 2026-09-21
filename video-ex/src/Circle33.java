public class Circle33 {
    public int radius;

    public Circle33(){
        System.out.println("Circle33()  응애 생성자");
    }
    public Circle33(int radius) {
        this.radius = radius;
        System.out.println("Circle33(int radius)  응애 생성자");
    }
    public double getArea() {
        return 3.14*radius*radius;
    }

}
