package static_ex;

public class StaticMemberUse59_61 {
    public static void main(String[] args){
        // new StaticMemberTest(); XXXXXXXXX
        System.out.println("고정금리:"+StaticMemberTest.FIXED_RATE);
        System.out.println("변동금리:"+StaticMemberTest.floatingRate);
        StaticMemberTest.floatingRate = 1.5;
        //StaticMemberTest.FIXED_RATE=1.5
        System.out.println("고정금리:"+StaticMemberTest.FIXED_RATE);
        System.out.println("변동금리:"+StaticMemberTest.floatingRate);

        StaticMemberTest cust1 = new StaticMemberTest();
        StaticMemberTest cust2 = new StaticMemberTest();
        cust1.name="김연이";
        cust1.pw="1234";

        cust2.name="최규성";
        cust2.pw="a3f6";

        cust1.output();
        cust2.output();

        cust1.floatingRate=80; // 첫번째 고객만 이율을 80% 로 준다는 개념으로 작성
        System.out.println("cust1.floatingRate=80;");

        cust1.output();
        cust2.output();

    }
}
