package C01BASIC;

import java.util.Scanner;

public class TestBusCard {
    public static void main(String[] args) {
//        버스카드
//        현재 가지고 있는 돈은 얼마인지 묻는다
//        입력값을 받아서 10000원 이상이면 택시를 타시오라고 출력
//        10000미만~3000원이상이면 버스를 타시오라고 출력


        System.out.println("현재 버스카드 잔액이 얼마이십니까?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int busCard = Integer.parseInt(input);
            if (busCard >= 10000){
                System.out.println("택시를 타십시오");
            }
            else if (busCard >= 3000) {
                System.out.println("버스를 타시오");
            }
            else {
                System.out.println("걸어가시오");
            }

    }
}
