package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("b compare to a : " + "b".compareTo("a"));
        System.out.println("c compare to a : " + "c".compareTo("a"));

        System.out.println("a compare to b : " + "a".compareTo("b"));
        System.out.println("a compare to c : " + "a".compareTo("c"));

        System.out.println("str1 compare to str3 : " + str1.compareTo(str3));
        System.out.println("str1 compare to IgnoreCase str2 : " + str1.compareToIgnoreCase(str2));


        System.out.println("str1 strat with 'Hello'" + str1.startsWith("Hello"));
        System.out.println("str1 end with 'Java!'" + str1.endsWith("Java!"));

    }
}
