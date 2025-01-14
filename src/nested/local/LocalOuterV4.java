package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(final int paramVar) {
        int localVar = 1; //지역변수 Stack프레임이 종료되는 순간 함께 종료된다

        class LocalPrinter implements Printer {
            int value = 0;
            
            @Override
            public void print() {
                System.out.println("value=" + value);
                
                //인스턴스는 지역변수보다 더 오래산다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);

            }
        }
        LocalPrinter printer = new LocalPrinter(); // 인스턴스 생성 시점에 지역변수를 캡쳐
        // 만약 locarVar의 값을 변경한다면? 다시 캡쳐해야 하나? 동기화문제 발생
        // localVar = 10;
        // paramVar = 20;
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        
        //printer.print()를 나중에 실행한다.  process()의 스택프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
