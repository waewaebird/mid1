package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2024,01,01,9,0,0);
        ZonedDateTime szdt = ZonedDateTime.of(ldt,ZoneId.of("Asia/Seoul"));
        ZonedDateTime lzdt = ZonedDateTime.of(ldt,ZoneId.of("Europe/London"));
        ZonedDateTime nzdt = ZonedDateTime.of(ldt,ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + szdt);
        System.out.println("런던의 회의 시간: " + lzdt);
        System.out.println("뉴욕의 회의 시간: " + nzdt);

    }
}
