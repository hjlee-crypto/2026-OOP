package static_ex;

public class StaticMemberTest {
    public static  double   floatingRate = 3.5 ;// 변동금리
    //public static  final  double fixedRate;
    //고정금리  final 변수 선언 하면 나중에 수정X,
    // 변수를 선언하는 시점에서 값을 대입 , 초기화
    public static  final  double FIXED_RATE = 10.4;

    //  non-static
    public String name;
    public String pw;

    public void  output(){
        System.out.println(name+ "고객님의 고정 이율은 " + FIXED_RATE +"%,"+
                "  변동 이율 :"+ floatingRate+"% 입니다." );
    }
}
