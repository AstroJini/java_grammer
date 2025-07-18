package C02ClassBasic;

public class C07Constructor {
    public static void main(String[] args) {
        // 캘린더 객체 생성 : 연도, 월, 일 세팅
        Calendar today = new Calendar("2025","06","18");
//        today.setYear(2025);
//        today.setMonth(06);
//        today.setDay(18);
        // 캘린더 객체 출력 : 오늘은 0000년도 00월 00일입니다."
        System.out.println(today.date());
        // toString() 매서드는 특별한 메서드로 객체명을 출력할 때 자동으로 실행
        System.out.println(today);
    }
}

// Calendar 클래스 생성 : year, month, day 모두 String
// 위의 별도 생성자를 추가할 경우 초기(기본) 생성자는 무시가되므로 필요시 별도로 추가
class Calendar {
    private String year;
    private String month;
    private String day;

//    생성자를 통해 객체 변수값들을 객체가 만들어지는 시점에 초기화
    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
    public String date () {
        return "오늘은 " + this.year + "연도 " + this.month +"월 " + this.day + "일 입니다.";
    }

    @Override
    public String toString() {
        return "toString()이용 : 오늘은 " + this.year + "연도 " + this.month +"월 " + this.day + "일 입니다.";
    }
}
