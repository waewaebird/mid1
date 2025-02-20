package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작 메서드를 전달해야하는데 그것은 불가
        //메서드를 갖고 있는 인스턴스를 전달해서 인스턴스의 메소드 호출
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        class Dice implements Process { //지역 클래스
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }
        class Sum implements Process { //지역 클래스
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        //메서드만 전달할 수는 없음, 인스턴스는 전달할 수 있음.
        Dice dice = new Dice();
        Sum sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
