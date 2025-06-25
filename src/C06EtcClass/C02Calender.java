package C06EtcClass;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.time.LocalDate;
import java.util.Objects;

public class C02Calender {
    public static void main(String[] args) {
//        java.util 패키지의 Calender클래스
        Calendar myCalender = Calendar.getInstance();
        System.out.println(myCalender.getTime());
        System.out.println(myCalender.get(Calendar.YEAR));
        System.out.println(myCalender.get(Calendar.MONTH)+1);
        System.out.println(myCalender.get(Calendar.DAY_OF_WEEK)); ///요일
        System.out.println(myCalender.get(Calendar.DAY_OF_MONTH)); ///날짜
        System.out.println(myCalender.get(Calendar.HOUR_OF_DAY)); ///24시 체계
        System.out.println(myCalender.get(Calendar.MINUTE));
        System.out.println(myCalender.get(Calendar.SECOND));

//        java.time 패키지의 LocalDateTime, LoclaDate, LocalTime 클래스 | 주로 LocalDateTime이 가장 많이 사용됨
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
//        get메서드와 ChronoField 매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(localDateTime.get(ChronoField.YEAR));
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY));// 0:오전 | 1:오후

//        .of : 임의로 특정시간 정보객체를 만들어내고 싶을 때 사용

        LocalDate birthDay = LocalDate.of(2001,8,22); ///날짜 객체
        System.out.println(birthDay);

        LocalDateTime birthDayTime = LocalDateTime.of(2001,8,22,16,14,30);
        System.out.println(birthDayTime);

        Object a = new String[10];
//        Object는 모든 클래스의 부모클래스이기에 다 담을 수 있지만 각 클래스별 메서드를 호출하는 것은 불가능하다
//        그래서 불분명한 클래스를 담아야 할 때 사용하지만 잘 사용되지는 않는다.
    }

}
