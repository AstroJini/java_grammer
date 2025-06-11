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

//        int answer = 877001;
//        System.out.println("비밀번호를 입력하십시오.");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        while (input!=answer) {
//            System.out.println("비밀번호가 올바르지 않습니다.");
//            if (input==answer) {
//                System.out.println("문이 열렸습니다.");
//            }
//        }// 다음 입력이 불가능해짐

////도어락 시스템 구축 while문 사용
//        int tryTime = 0;
//        while (tryTime < 5) {
//            int answer = 877001;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if (input == answer) {
//                System.out.println("문이 열립니다.");
//                break;
//            }
//            else {
//                System.out.println("비밀번호가 틀립니다.");
//            }
//            tryTime++;
//        }
//        if (tryTime >= 5){
//            System.out.println("비밀번호 시도횟수 초과 문이 잠깁니다.");
//        }

/// 정수형 타입의 경우
//        int tryTime = 0;
//        for (int i = 1; i <= 5; i++) {
//            int answer = 877001;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if (input == answer){
//                System.out.println("문이 열립니다.")
//                break;
//            }else {
//                System.out.println("비밀번호가 틀립니다.");
//                System.out.println("지금까지 잠금해제를 " + i + "회 시도했습니다.");
//                if (i>=5) {
//                    System.out.println("비밀번호 시도횟수 초과 문이 잠깁니다.");
//                }
//            }
//            tryTime += i;
//        }
/// 문자열의 경우
//        int tryTime = 0;
//        for (int i = 1; i <= 5; i++) {
//            String  answer = "openTheDoor";
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if (input.equals("openTheDoor")){
//                System.out.println("문이 열립니다.");
//                break;
//            }else {
//                System.out.println("비밀번호가 틀립니다.");
//                System.out.println("지금까지 잠금해제를 " + i + "회 시도했습니다.");
//                if (i>=5) {
//                    System.out.println("비밀번호 시도횟수 초과 문이 잠깁니다.");
//                }
//            }
//            tryTime += i;
//        }


    }
}


import java.util.Scanner;

public class DoorLockSystem {
    // 올바른 비밀번호 설정
    private static final int CORRECT_PASSWORD = 1234;
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemptCount = 0;

        System.out.println("=== 도어락 시스템 ===");
        System.out.println("비밀번호를 입력하세요.");

        while (attemptCount < MAX_ATTEMPTS) {
            System.out.print("비밀번호: ");
            int inputPassword = scanner.nextInt();

            // 비밀번호가 맞는 경우
            if (inputPassword == CORRECT_PASSWORD) {
                System.out.println("🔓 도어락이 열렸습니다! 환영합니다.");
                scanner.close();
                return; // 프로그램 종료
            }

            // 비밀번호가 틀린 경우
            attemptCount++;
            System.out.println("❌ 비밀번호가 틀렸습니다.");
            System.out.println("틀린 횟수: " + attemptCount + "회");

            // 5회 미만이면 다시 시도
            if (attemptCount < MAX_ATTEMPTS) {
                System.out.println("다시 입력해주세요. (남은 기회: " + (MAX_ATTEMPTS - attemptCount) + "회)");
            }
        }

        // 5회 이상 틀린 경우
        System.out.println("🔒 비밀번호를 " + MAX_ATTEMPTS + "회 틀렸습니다.");
        System.out.println("도어락이 잠겼습니다. 시스템 관리자에게 문의하세요.");

        scanner.close();
    }
}