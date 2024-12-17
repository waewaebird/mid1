package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002

        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        String str3 = "hello"; //x003
        String str4 = "hello"; //x004 ?? x003이다. 문자열 리터럴은  '*문자열 풀*' 에 저장(Heap영역 && Hash알고리즘)

        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
    }
}
