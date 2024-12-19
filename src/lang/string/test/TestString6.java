package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int cnt = 0;

        while (true) {
            if(str.indexOf(key) > 0) {
                cnt++;
                str = str.substring(str.indexOf(key) + key.length());
            } else {
                break;
            }
        }
        System.out.println("count " + cnt);
    }

}
