


public class Circle33ArrayTest {
    public static  void main(String[] args){
        Circle33 [] refCircle33Array = new Circle33[5];
        int size= refCircle33Array.length;
        for(int i=0 ; i< size  ; i++ ){
            refCircle33Array[i] = new Circle33( i);
        }

        for( int i=0 ; i <size ; ++i ){
            System.out.print(refCircle33Array[i].getArea() + " ");
        }

    }
}
