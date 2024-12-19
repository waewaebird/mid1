package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitss = fruits.split(",");

        for(String s : fruitss) {
            System.out.println(s);
        }

        System.out.println("joinedString = "+String.join("->",fruitss));


    }

}
