package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작 메서드를 전달해야하는데 그것은 불가
        //메서드를 갖고 있는 인스턴스를 전달해서 인스턴스의 메소드 호출
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        System.out.println("Hello 실행");
        hello(() -> { //람다로 함수를 안지로 전달
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> { //람다로 함수를 안지로 전달
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
