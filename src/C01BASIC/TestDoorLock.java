package C01BASIC;

import java.util.Scanner;

public class TestDoorLock {
    public static void main(String[] args) {
//        도어락키 예제 -> 무한 반복되는 도어락키 예제 -> 5회 입력횟수 제한 있는 도어락키 예제
//        int answer = 877001;
//        System.out.println("비밀번호를 입력해주십시오.");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (input == answer) {
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 올바르지 않습니다.");
//        } // 일회성 코딩

        int answer = 877001;
        System.out.println("비밀번호를 입력하십시오.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input!=answer) {
            System.out.println("비밀번호가 올바르지 않습니다.");
            if (input==answer) {
                System.out.println("문이 열렸습니다.");
            }
        }// 다음 입력이 불가능해짐

    }
}
