package enumeration.test;

import java.sql.SQLOutput;

public enum AuthGrade {
    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3,"관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public void process() {
        System.out.println("당신의 등급은 " + getDescription() + "입니다");
        if(getLevel() == 1) {
            System.out.println("==메뉴 목록==");
            System.out.println("-메인 화면");
        } else if(getLevel() == 2) {
            System.out.println("==메뉴 목록==");
            System.out.println("-메인 화면");
            System.out.println("-이메일 관리 화면");
        } else if(getLevel() == 3) {
            System.out.println("==메뉴 목록==");
            System.out.println("-메인 화면");
            System.out.println("-이메일 관리 화면");
            System.out.println("-관리자 화면");
        }
    }
}
