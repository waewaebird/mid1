package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급 할인 금액 : " + vip);

        //실수 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDㅇ 등급 할인 금액 : " + diamondd);
        
        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급 할인 금액 : " + gold);
        
        //String은 컴파일시의 오류를 알 수 없음
    }
}
