package C01BASIC;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//       정수 : byte(1바이트), int(4바이트), long(8바이트)
        byte a = 127;
        byte b = -128; //보통 나이에 사용하곤 함
//        오버플로우 : 자료형이 표현할 수 있는 범위를 넘어선
        a++;
//        언더플로우
        b--;
        System.out.println(a); //-128
        System.out.println(b); //127

        int i1 = 10; // -20억 ~ 20까지 표현 가능
        long l1 = 10; // 롱을 남발할 경우 할당되는 메모리의 양이 많아지기 때문에 복잡도가 높아짐

//        long은 명시적으로 L을 붙여 long타입임을 명시하기도 함.
        long l2 = 20L;

//        실수 : float, double(기본) -> 실수연산은 오차를 발생시킴.
        float f1 = 1.123F;
        double d1 = 1.123;

//        부동소수점 오차 테스트
        double d2 = 0.1;
        System.out.println(d2);

        double total = 0;
        for(int i=0; i<1000; i++) {
            total = total +0.1;
        }
        System.out.println(total);

//        소수점 연산 오차 해결방법: 정수로 변환 후 연산하여 추후 나눗셈으로 해결.
        double total2 = 0;
        for(int i=0; i<1000; i++) {
            total2 = total2 +0.1*10;
        }
        System.out.println(total2/10);

//        소수점 오차 해결방법 : Bigdecimal 클래스 사용

        double d1 = 1.03;
        double d2 = 0.42;
        System.out.println(d1-d2);
        BigDecimal b1 = new BigDecimal("1.03"); //값을 입력받을 때부터 소수점으로 받게 되면 이미 오차가 발생하므로 문자로 입력.
        BigDecimal b2 = new BigDecimal("0.42");
        double d3 = b1.subtract(b2).doubleValue();
        System.out.println(d3);

//        문자형 :char -> 2바이트~4바이트의 데이터를 할당함.
        char c1 = '가'; //내부적으로 숫자 값을 가지고 있다.
        String st1 = "가나"; //다수의 문자가 들어갈 수 있으며 ""를 쓰는 것이 룰이다.
        System.out.println(c1);
//
        boolean : true or false
        boolean b1 = false; //제어문과 함께 사용함
        System.out.println(b1);
        if (b1) {
            System.out.println("참입니다.");
        }else {
            System.out.println("거짓입니다.");
        }
//
//        null도 하나의 타입이다.
//        참조형자료에 값을 할당하지 않으면 null이 할당된다.
        String st1 = "";
        String st2 = null;
        String st3;
        System.out.println(st1.isEmpty());
        System.out.println(st2.isEmpty()); // null을 대상으로 string의 메서드 사용 불가

//        int값은 참조형 자료가 아니기 때문에 내부적으로 0이 할당 된다.
        String[] arr = new String[5];
        arr[1] =  "hello world1";
        arr[3] =  "hello world3";
        for (int i=0; i<5; i++){
            System.out.println(arr[i].length());
        }

//        타입변환
//        묵시적 타입변환,명시적 타입변환
        char c1 = 'a';
        int i1 = c1;
        System.out.println(i1);
        System.out.println('a' > 'b');

//        알파벳 소문자 제거문제
        String st1 = "01abcd123한글123";
        String answer = "";
        for (int i=0; i<st1.length(); i++){
            char ch = st1.charAt(i);
            if (ch < 'a' || ch > 'z') {
                answer += ch;
            }
        }
        System.out.println(answer);

//        c1 < 'a' || c1 > 'z';

//        int -> double
        int i1 =10;
        double d1 = i1;
        System.out.println(d1);

//        double -> int
        double d2 = 10.5;
        int i2 = (int)d2;
        System.out.println(i2);

//        정수/정수의 경우 소수점 절사 문제 발생
//        두 수가 모두 정수이면 결과값이 정수일 것이라도 java가 판단한다.
        int a = 1;
        int b = 4;
        double d = a/b; //이러면 애초에 여기서 연산할 때 0으로 값이 들어가서 해결 불가
        System.out.println(d1);
        double d2 = (double)a/b;
        System.out.println(d2);

//        변수와 상수
        int a1 = 10;
//        변수값 재할당은 가능
        a1 = 20;
//        변수값 재선언하는 것은 불가능
//        int a1 = 30;

//        상수는 초기값을 할당한 이후에 재할당 하는 것이 불가능
//        상수는 final키워드를 사용
        final int f1 = 20; //예를 들어 파이값
//        f1 = 30; // 재선언, 재할당 모두 불가능

    }
}
