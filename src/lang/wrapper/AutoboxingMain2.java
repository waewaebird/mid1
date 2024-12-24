package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //Auto - boxing 컴파일러(자바가 함)에서 함.컴파일 단계

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //Auto - unboxing 컴파일러(자바가 함)에서 함.컴파일 단계


        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }



}
