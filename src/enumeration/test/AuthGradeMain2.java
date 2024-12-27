package enumeration.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> temp = new ArrayList<>();
        System.out.print("당신의 등급을 입력하세요");
        for(AuthGrade grade : AuthGrade.values()) {
            temp.add(grade.name());
        }
        System.out.print(temp);
        System.out.print(" : ");

        String s = in.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(s.toUpperCase());
        authGrade.process();
    }
}
