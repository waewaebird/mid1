package time.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("년도를 입력 하세요 : ");
        int year = in.nextInt();

        System.out.println("월을 입력 하세요 : ");
        int month = in.nextInt();

        LocalDate ld = LocalDate.of(year,month,1);

        Month temp = ld.getMonth();



        System.out.println(temp.maxLength());



        
    }

}
