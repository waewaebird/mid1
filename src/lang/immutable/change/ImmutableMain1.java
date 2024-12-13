package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutablObj obj1 = new ImmutablObj(10);
        ImmutablObj obj2 = obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());

    }

}
