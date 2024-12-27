package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++) {
            LocalDate localDate = LocalDate.of(2024, 1, 1);
            System.out.println("날짜 " + (i+1) + ": " + localDate.plusDays(i*14));
        }
    }
}
