package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 Java가 포함되어 있는지 : " + str1.contains("Java"));
        System.out.println("Java의 첫번째 인덱스 : " + str1.indexOf("Java"));
        System.out.println("인덱스 10부터 Java 인덱스 : " + str1.indexOf("Java", 10));
        System.out.println("Java의 마지막 인덱스 : " + str1.lastIndexOf("Java"));
    }

}