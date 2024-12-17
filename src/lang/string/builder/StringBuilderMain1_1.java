package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("revers = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);

        /*String a = new String("test");
        String b = new String("test");
        System.out.println(Integer.toHexString(System.identityHashCode(a)));
        System.out.println(Integer.toHexString(System.identityHashCode(b)));
        String aa = "test";
        String bb = "test";
        System.out.println(Integer.toHexString(System.identityHashCode(aa)));
        System.out.println(Integer.toHexString(System.identityHashCode(bb)));*/

    }
}
