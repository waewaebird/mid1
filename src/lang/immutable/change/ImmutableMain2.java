package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutablObj obj1 = new ImmutablObj(10);
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
    }

}
