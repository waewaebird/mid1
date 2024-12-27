package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2021,1,1,1,1,1);
        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        
        //날짜 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산 불변
        LocalDateTime ofDtPlus = ofDt.plusDays(3000);
        System.out.println("지정 날짜 + " + ofDtPlus);
        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
        System.out.println("지정 년도 + " + ofDtPlusYear);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가 ? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가 ? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜과 같은가 ? " + nowDt.isEqual(ofDt)); //영국 0시 == 한국 9시
    }
}
