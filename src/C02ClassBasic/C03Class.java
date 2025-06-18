package C02ClassBasic;


import java.util.*;

public class C03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10,20)); ///클래스만 사용하면 힙메모리에만 값이 할당 된다.

////        오류상황 연출
////        A부서의 매출
////        20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20));
////        30원 매출 발생
//        System.out.println(MyCalculator.sumAcc(30));
//
////        40원 매출 발생
//        System.out.println(MyCalculator.sumAcc(40));
//
////        누적합: 90원
//
////        B부서의 매출
////        10원 매출 발생
//        System.out.println(MyCalculator.sumAcc(10)); ///100원 -> 10원이 돼야함
////        20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20));/// 120원 -> 30원이 돼야함


//        객체를 활용한 매출 계산
//        A회사 매출 : 10원, 20원
        MyCalculatorInstance mi1 = new MyCalculatorInstance();
//        MyCalculatorInstance.sumAcc(); | static이 없으므로 sumAcc는 호출이 불가 -> 객체로 만들어서 호출해야함
        mi1.sumAcc(10); ///각 객체별로 힙 메모리에 저장된 것
        System.out.println(mi1.total); /// 힙 메모리에 저장된 값을 꺼내는 방법으로 출력 가능
        mi1.sumAcc(20);
        System.out.println(mi1.total);

//        B회사 매출 : 10원, 20원
        MyCalculatorInstance mi2 = new MyCalculatorInstance();
        mi2.sumAcc(10);
        System.out.println(mi2.total);
        mi2.sumAcc(20);
        System.out.println(mi2.total);

        System.out.println(MyCalculatorInstance.total_count);

//        자료구조에서 객체사용 예시
//        배열
        String[] arr1 = new String[] {"hello", "java", "python"};
        Arrays.sort(arr1); ///클래스 메서드
        System.out.println(arr1.length); ///객체(인스턴스)메서드

//        리스트
        List<String>myList = new ArrayList<>();
        Collections.sort(myList); ///클래스메서드
        myList.sort(Comparator.reverseOrder());///객체 메서드




    }
}

class MyCalculator{ ///  객체를 만들기 위한 설계도이다
/// 이런식으로 하면 여러개의 객체마다 클래스를 따로 명시해줘야 원하던 목적을 달성할 수 있음
///
    public static int sum(int a, int b){
        return a+b;
    }
    static int total = 0;
//    static이 붙어있으면 클래스변수, static이 붙어있지 않으면 객체변수
    public static int sumAcc(int a){

        total += a;
        return total;
    }
} /// 이 class는 재사용이 불가한 클래스이다.

class MyCalculatorInstance {
     int total = 0;
//     클래스 변수는 모든 인스턴스(객체) 간에 상태 공유 목적으로 주로 사용
     static int total_count=0;

//     클래스를 만들면 아래와 같은 클래스명의 이름을 가진 메서드(생성자)가 기본으로 만들어짐
//    생성자의 주된 목적은 객체 변수를 초기화하기 위한 목적으로 주로 사용.
//    우리가 new 메서드로 객체를 선언하면 아래와 같은게 생성되고 숨겨져 있음
     public MyCalculatorInstance() { /// 반환값이 필요없음
         total_count++;
     }



//     클래스메서드는 객체의 상태와 상관없는 독립적인 로직 수행 시에 사용 가능
    public static int sum(int a, int b){ /// 밑의 것과 속성이 달라서 이건 무조건 return | 객체변수에 값을 계속해서 새로 할당하지 않아도 되기 때문에 static사용
        return a+b;
    }
    public void sumAcc(int total){ ///
//        this는 객체 그 자신을 의미한다
//        일반적으로 매개변수와 객체변수를 구분짓기 위해 사용한다. (ex. 매개변수명도 total, 객체변수명도 total인 경우)
        this.total += total; /// 힙 메모리에 각 객체별로 값이 저장되기 때문에 따로 return을 하지 않아도 된다.
    }
}

///객체는 클래스의 복제본임