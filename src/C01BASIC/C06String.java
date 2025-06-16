package C01BASIC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        원시자료형은 스택 메모리에 저장되므로 비교시 값 자체를 비교
//        int a = 10;
//        int b = 10;
//        System.out.println(a==b); // true
//
////        참조자료형의 비교는 기본적으로 메모리 주소값끼리의 비교
//        String st1 = new String("hello");
//        String st2 = new String("hello");
//        System.out.println(st1==st2);
//        System.out.println(st1의 힙메모리주소==st2의 힙메모리주소); // false
//        System.out.println(st1.equals(st2)); // true
//
////        WrapperClass : 기본형 타임을 Wrapping한 클래스
//        int i1 = 10;
////        Integer ig1 = new Integer(10);
//
////        auto boxing 오토박싱 : 원시자료형 ->Wrapper클래스 자동 형변환
//        Integer ig = 10;
////        auto unboxing 오토언박싱 : Wrapper클래스 -> 원시자료형으로 자동현변환
//        int i2 =ig;
//
////        Wrapper클래스의 기능
//        int i3 =20;
//        String st3 = Integer.toString(i3);
//        String st4 = String.valueOf(i3);
//        int i4 = Integer.parseInt(st3);
//
////        배열(참조자료형)에는 원시타입 자료형 세팅가능
//        int[] arr = {10, 20, 30};
//
////        그 외 (리스트, set, map) 등에는 참조자료형을 세팅해야함
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

////        String 선언방법 2가지
////        객체선언방식
//        String st1 = new String("hello world");
//        String st2 = new String("hello world");
////        리터럴방식
//        String st3 = "hello world";
//        String st4 = "hello world";
//        System.out.println(st1==st2); // false
//        System.out.println(st3==st4); // true
//        리터럴 방식끼리의 비교는 같은 값을 넣었을 때 True로 나온다 그 이유는 같은 값을 할당하면 각각 새로운 메모리 영역에 할당해 주는 것이 아니라
//        이미 있는 값을 모두 같이 참조하기 때문에 리터럴 값을 비교하면 true로 나오는 것이다.
//        System.out.println(st1==st3); // false

////        참조 자료형의 비교는 ==를 지양
//        System.out.println(st1.equals(st3));

////        equals: 두 문자열 비교
//        String st1 = "hello";
//        String st2 = "hello";
//        String st3 = "Hello";
//        System.out.println(st1.equals(st2));
//        System.out.println(st1.equals(st3));
//        System.out.println(st1.equalsIgnoreCase(st2));//대소문자와 구분없이 비교하는 것

////        length : 문자열의 길이
//        String st1 = "hello1 Wolrd1 Java";
//        System.out.println(st1.length());
////        charAt : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);

//        String st1 = "hello1 Wolrd1 Java";
////        위 문자열의 소문자알파벳의 개수구하기
////        for, length, charAt를 사용
//        int total = 0;
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.charAt(i)>='a'&&st1.charAt(i)<='z') {
//                total++;
//            }
//        }
//        System.out.println(total);
//
////        a의 개수가 몇개인지 출력
//        String st2 = "aaasdjkfnkjsdanaaassfaaa";
//        int count = 0;
//        for (int i = 0; i < st2.length(); i++) {
//            if (st2.charAt(i)=='a') {
//                count++;
//            }
//        }
//        System.out.println(count);
//
////        toCharArray : String 문자열을 char배열로 리턴
////        char[] chArr = st2.toCharArray();
//        int count2 = 0;
//        for (char c : st2.toCharArray()){
//            if (c=='a')count2++; //실행문이 1줄밖에 없을 때는 중괄호 생략 가능
//        }

////        indexOf : 특정 문자열의 위치 반환. 가장 먼저 나오는 문자열의 위치반환
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//
////        contains : 특정 문자열이 포함되어 있는지 여부(boolean)를 리턴
//        System.out.println(st1.contains("hello")); //true
//        System.out.println(st1.contains("world")); //false

////      문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += " world";
//        st1 += "1"; //String에 char를 더하면 String으로 더해짐.
//        System.out.println(st1);

//        프로그래머스-나머지구하기(플랫폼 사용방법)
//        프로그래머스-특정 문자 제거하기
//        프로그래머스-가운데 글자 가져오기

////        substring(a,b) : a이상 b미만의 index의 문자를 잘라 문자열 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length())); // world

////        trim, strip : 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world  ";
//        String trim1 = st1.trim();
//        String trim2 = st1.strip();
//        System.out.println(trim1);
//        System.out.println(trim2);

////        toUpperCase : 모든 문자열을 대문자로 변화, toLowerCase: 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

////        replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

////        replaceAll(a,b): replace와 사용법 동일| 정규표현식을 쓸 수 있는 점이 차이점.
//        String st1 = "01aksGdjDDFfGRn한글023480";
////        한글 제거
//        String answer1 = st1.replaceAll("[가-힣]", "");
//        String answer2 = st1.replaceAll("[a-z]", "");
//        String answer3 = st1.replaceAll("[A-Za-z]", "");
//        System.out.println(answer1);
//        System.out.println(answer2);
//        System.out.println(answer3);

////        replaceAll의 활용 - 전화번호 검증
//        String number = "010-5317-8884";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}");
//        if (check == false) {
//            System.out.println("다시 입력하세요");
//        }
////        replaceAll의 활용 - 이메일 검증
//        String email = "세진ignis201@naver.com";
//        boolean check_email = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        System.out.println(check_email);

////        split : 특정문자를 기준으로 잘라서 문자배열로 만드는 것.
//        String a = "a:b:c:d";
//        String[] arr = a.split(":");
//        System.out.println(Arrays.toString(arr));
//
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+"); // \s: 공백, \n: 줄바꿈
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));

////        null과 공백의 차이
//        String st1 = null; //null은 String이 아님
//        String st2 = "";//공백은 문자열
//        String st3 = " ";
//        System.out.println(st1==st2);//false
////        System.out.println(st1.isEmpty());//nullpointer exception 발생
//        System.out.println(st2.isEmpty());//true
//        System.out.println(st3.isEmpty());//true
//        System.out.println(st3.isBlank());//true 공백 체크하는 용도로 활용 가능


//        String abc = "hello    world java";
//        for (int i = 0; i < abc.length(); i++) {
//            if (abc.substring(i,i+1).isBlank()) {
//                System.out.println(i + "번째는 blank");
//            }
//        }

////        문자열합치기
//        String[] arr = {"java", "python", "javascript"};
//        String answer1 = "";
//        for (String a : arr) {
//            answer1 += a;
//            answer1 += " "; // \n을 사용하면 줄바꿈 추가
//        } // 매번 answer1값이 재선언이 되기 때문에 유의미하게 성능이 떨어진다.
//        System.out.println(answer1);
//        String answer2 = String.join("\n", arr);
//        System.out.println(answer2);
//

////        StringBuffer : 문자열 조립 객체
//        StringBuffer sb = new StringBuffer();
////        append는 맨 뒤에 문자열을 더하는 메서드
//        sb.append("python");
//        sb.append("java");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);
//        String[] arr = {"java", "python", "javascript"};
//        StringBuffer sb2 = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            sb2.append(arr[i]);
//            sb2.append("\n");
//        }
//        sb2.insert(0, "C++\n"); //이런 식의 insert는 가능하면 지양하는게 좋다.
//        sb2.deleteCharAt(sb.length()-1);
//        System.out.println(sb2);


////        StringBuilder : 문자열 조립 객체(가장빠름) | 문제풀이 때 사용 추천
//        String st1 = "hello";
////        StringBuillder는 동시성 이슈 발생한다 == Tread-safe 하지 않음 | 성능이 뛰어남
//        StringBuilder sb = new StringBuilder();
////        StringBuffer는 동시성 이슈 발생하지 않고 == Tread-safe 하다 | 성능은 떨어짐
//        StringBuffer sb2 =new StringBuffer();

//
////        문자열 뒤집기
//        String st1 = "hello";
//        StringBuilder sb = new StringBuilder();
//        for (int i = st1.length()-1; i >=0 ; i--) {
//            sb.append(st1.charAt(i));
//        }
//        System.out.println(sb);

//        프로그래머스-문자열 밀기

//        문자열 비교 - compareTo는 문자열 마이너스다

//        String s1 = "hello";
//        String s2 = "dello";
//        String s3 = "dello";
//        System.out.println(s1.compareTo(s2)); ///양수
//        System.out.println(s2.compareTo(s1)); ///음수
//        System.out.println(s1.compareTo(s3)); ///0

    }
}
