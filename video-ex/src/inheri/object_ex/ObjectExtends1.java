package inheri.object_ex;

public class ObjectExtends1 /*extends Object*/ {
    public  void output(){
        System.out.println(getClass().getName());
        System.out.println(toString());
        System.out.println( this.toString() );
    }
    public static void main(String[] args){
        //output(); // static method 에서 non static output() 호출 X
        ObjectExtends1 ref = new ObjectExtends1();
        ref.output();
    }
}
