package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        Random random = new Random(); //seed가 같으면 Random의 반복실행해도 결과가 같다

        int randomInt = random.nextInt();
        System.out.println("randomInt : " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomInt : " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean : " + randomBoolean);

        //범위 조회
        int randomRang1 = random.nextInt(10);//0~9까지 조회
        System.out.println("0 ~ 9 : " + randomRang1);

        int randomRang2 = random.nextInt(10) + 1;//1~10까지
        System.out.println("1 ~ 10 : " + randomRang2);

    }
}
