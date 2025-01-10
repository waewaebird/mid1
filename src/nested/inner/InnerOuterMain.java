package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        //바깥 클래스의 인스턴스를 생성해야만! 내부클래스를 생성한다. 즉 인스턴스 안에 생성된다.
        InnerOuter outer = new InnerOuter(); //x001
        InnerOuter.Inner inner = outer.new Inner(); // x001 (인스턴스) 내부에 또 만들어라

        //하지만 실제로는 inner클래스는 참조 보관을 알고 있어서 참조값을 들고있다.

        inner.print();

        System.out.println("innerClass : " + inner.getClass()) ;
    }
}
