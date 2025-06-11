package C01BASIC;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        버스카드
//        현재 가지고 있는 돈은 얼마인지 묻는다
//        입력값을 받아서 10000원 이상이면 택시를 타시오라고 출력
//        10000미만~3000원이상이면 버스를 타시오라고 출력


//        System.out.println("현재 버스카드 잔액이 얼마이십니까?");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        int busCard = Integer.parseInt(input);
//            if (busCard >= 10000){
//                System.out.println("택시를 타십시오");
//            }
//            else if (busCard >= 3000) {
//                System.out.println("버스를 타시오");
//            }
//            else {
//                System.out.println("걸어가시오");
//            }

///        1~10중에 홀수만 출력하기
//        for (int i = 1; i <=10 ; i++) {
//            if (i%2!=0){
//                System.out.println(i);
//            }
//        }
///        1~10중에 짝수만 출력하기
//        for (int i = 1; i <=10 ; i++) {
//            if (i%2==0) {
//                System.out.println(i);
//            }
//        }
///        1~20중에 짝수의 총합 구하기
//        int total = 0;
//        for (int i = 1; i <= 20; i++) {
//            if (i%2==0){
//                total += i;
//            }
//        }
//        System.out.println(total);

///        두 수의 최대 공약수 찾기
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int answer = 0;
        int min = input1<input2? input1 : input2;
        for (int i = 1; i < min; i++) {
            if (input1%i == 0 && input2%i == 0) {
                answer = i;
            }
        }
        System.out.println(answer);


//        int a = 24;
//        int b = 36;
//        int min = a>b? b:a;
//        int answer = 0;
//        for (int i = 1; i <= min ; i++) {
//            if (a%i == 0 && b%i == 0) {
//                answer = i;
//            }
//        }
//        System.out.println(answer);


    }
}
