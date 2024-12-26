package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        Integer answer = Integer.valueOf(str1, 10) + Integer.valueOf(str2, 10);

        System.out.println("두 수의 합 " + answer);
    }
}
