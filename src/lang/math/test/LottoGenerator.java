package lang.math.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        List<Integer> lottos = new ArrayList<>();
        Random random = new Random();

        while(lottos.size() < 6) {
            int number = random.nextInt(45) + 1;
            if(!lottos.contains(number)) {
                lottos.add(number);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Integer nn : lottos) {
            sb.append(nn + " ");
        }

        System.out.println("로또 번호 : " + sb);

    }
}
