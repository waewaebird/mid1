package nested.nested;
//정적 중첩 클래스 패키지

public class NestedOuterMain {
    public static void main(String[] args) {
        //NestedOuter outer = new NestedOuter();
        
        //안에꺼만 따로 생성한것
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
