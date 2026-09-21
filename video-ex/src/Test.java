public class Test {
    public static void main(String[] x){
        System.out.println("main메소드의 x라는 매개변수가 받은 데이터 수를 출력할거다");
        System.out.println("데이터 수:"+ x.length);
        for( int i=0 ; i < x.length ; i++  ){
            //  x가 참조하는 배열의 0번째 방의 데이터는 ~~~~
            //  x가 참조하는 배열의 1번째 방의 데이터는 ~~~~
            //  x가 참조하는 배열의 2번째 방의 데이터는 ~~~~
            System.out.println("x가 참조하는 배열의" + i + "번째 방의 데이터는  " + x[i] );
        }//for i
        System.out.println(x[10]+"end");
    }
}
