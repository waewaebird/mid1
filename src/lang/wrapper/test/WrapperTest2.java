package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5" , "2.5" , "3.0"};

        Double d = 0D;
        for(String s : array) {
            d += Double.parseDouble(s);
        }

        System.out.println("sum = " + d);
    }
}
