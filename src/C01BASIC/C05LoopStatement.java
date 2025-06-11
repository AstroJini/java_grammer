package C01BASIC;

import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {

//        int a = 0;
//        while (a < 10) {
//            System.out.println("hello world");
////            a++;
//            a = a+1;
//        } // 무한츠쿠요미 완성

//        while문을 활용하여 2~10까지 출력
//        int a = 2;
//        while (a<=10) {
//            System.out.println(a);
//            a++;
//        }
//         도어락키 예제 -> 무한 반복되는 도어락키 예제 -> 5회 입력횟수 제한 있는 도어락키 예제


//        int tryTime = 0;
//        while (tryTime < 5) {
//            int answer = 877001;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if(answer == input) {
//                System.out.println("문이 열립니다.");
//                break; //break 키워드를 통해 가장 가까이에 있는 반복문을 즉시종료
////                만약 while문이 여러개 있을 때 break가 있으면
//            } else {
//                System.out.println("비밀번호가 틀린데요???");
//            }
//            tryTime++;
//        }
//        System.out.println("시도횟수 초과 제거모드 실행합니다.");
//
//        입력한 숫자의 구구단 단수 출력 EX) 2 -> 2X1 =2 2X2 =4
//        while (true) {
//            System.out.println("구구단 단수를 입력해주세요");
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            int a = 1;
//            if (a<10) {
//                System.out.println(input + "X" + a + " = " + input*a);
//                a++;
//                break;// 내가 쓴 답| 이렇게
//            }


//           while (true) {
//        System.out.println("구구단 단수를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int a = 1;
//        while (a<10) {
//            System.out.println(input + "X" + a + " = " + input * a);
//            a++;
//        }
//    }

////        do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        while (a<10) {
//            System.out.println(a);
//        } //조건문에서 걸려서 실행자체가 불가함
//        int a = 100;
//        do {
//            System.out.println(a);
//        }
//        while (a<10);
//
////        for문: 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문

////        fot문은 사용했던 변수명을 for문이 끝난 이후에 재선언이 가능
//        for (int a=0; a<10; a++) {
//            System.out.println(a);
//        }

//        1~10중에 홀수만 출력하기
//        {}를 자바에서는 영역으로 생각하는데 상위 영역에서 설정한 값을 하위영역에서는 사용할 수 있지만, 하위영역에서 지정한 변수를 상위영역에서 사용할 수는 없다
//        for (int i=0; i<10; i++) {
//            System.out.println(i);
//                for (int i = 0; i < 10; i++) {
//                }
//        }
//        }
//        for (int i = 1; i < 11; i++) {
//            if (i%2!=0) {
//                System.out.println(i);
//            }
//        }

////        1~20까지 짝수의 총합 출력
//        int total = 0;
//        for (int i = 1; i < 21; i++) {
//            if (i%2 == 0) {
//                total += i;
//            }
////            총합은 모든 i값을 더하는거
//
//        }
//        System.out.println(total);


//        두 수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int c;
//        if (a<b) {
//            for (int i = 1; i < a; i++) {
//                int c = a % i;
//
//            }
//        }else {
//            for (int i = 1; i < b; i++) {
//
//            }
//        }
//        System.out.println("최대 공약수는 " + c);
//        int min = a>b? b:a;
//        int answer = 0;
//        for (int i = 1; i <= min ; i++) {
//            if (a%i == 0 && b%i == 0) {
//                answer = i;
//            }
//        }
//        System.out.println(answer);/// 방법 2

//        int min = a>b? b:a;
//        for (int i = min; i >1; i--) {
//            if (a%i == 0 && b%i == 0) {
//                System.out.println(i);
//                break;
//            }
//        } /// 방법2

//        소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
//        사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        for (int i = 2; i < input; i++) {
//            int minor = input%i;
//            if (minor == 0) {
//                System.out.println(minor);
//                System.out.println("소수입니다.");
//            }else {
//                System.out.println("소수가 아닙니다.");
//            }
//        }// 내가 쓴 답

//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean check = false;
//        for (int i = 2; i < input; i++) {
//            if (input%i == 0) {
//                check = true;
//                break;
//            }
//        }
//        if (!check) {
//            System.out.println("소수입니다.");
//        }else {
//            System.out.println("소수가 아닙니다.");
//        } // 로직은 맞지만 비효율적 시간을 절약할 수 있다.


//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean check = false;
//        for (int i = 2; i < input; i++) {
//            if (input%i == 0) {
//                check = true;
//                break;
//            }
//        }
//        if (!check) {
//            System.out.println("소수입니다.");
//        }else {
//            System.out.println("소수가 아닙니다.");
//        }

//        continue : 반복문의 조건식으로 이동하는 명령어
//        for (int i = 1; i < 11; i++) {
//            if (i%2==0) {
////                continue는 코드의 직관성과 가독성을 위해 사용한다.
////                continue;
////            }
////            System.out.println(i);
////        }
//
////        향상된(enhanced) for문 - for each문
//        int[] arr = {1, 3, 5, 7};
////        일반for문을 활용한 배열 접근 방식 | 직접 배열에 접근해서 값을 산출
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        //향상된for문을 활용한 배열 접근 방식 | 배열의 참조값을 가져와서 값을 산출하는 것
//        for(int a : arr){ //arr 배열을 돌면서 int a 에 값을 할당하는 것 그래서 모든 배열을 다 돌면 출력이 끝남
//            System.out.println(a);
//        }
//        //일반for문을 통한 arr의 저장된 값 변경
//        for(int i=0; i<arr.length; i++){
//            arr[i]+=10; // arr배열의 i번째 값에 10을 더한 값을 할당하는 것
//        }
//        // 참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력
//        System.out.println(Arrays.toString(arr)); //int값의 배열을 객체타입으로 긁어와서 출력하는 것...?
//        //향상된for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가
//        for(int a : arr){ //향상된 for문 자체가 arr배열의 복사본을 가져와서 int a에 값을 할당해주는 것이기 때문에 원본 데이터의 값은 바뀌지 않는 것이지
//            a+=10;
//        }
        // 향상된 for문을 통한 arr의 저장된 값 변경
        // 원본의 값 변경 불가
        // 향상된 for문은 읽기 중심(read-only iteration)을 목적으로 설계되었다.
        // 원본 데이터에 대한 변경은 명시적으로 해야만 하며, for-each에서 실수로 값을 변경했다고
        // 착각하는 오류를 방지하기 위한 언어적 장치이다. 이는 명확하고 예측 가능한 코드 작성을 유도한다.
//
//
//
////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if (true) {
//            num = 20;
//            int num2 = 20;
//        }
////        num2 = 30; // if문 중괄호 내에서 정의된 변수는 해당 중괄호 밖에서는 사용불가.
//        System.out.println(num);

//        다중 반복문
//        2~9단까지 한꺼번에 출력 + 각 단마다 몇단입니다. 출력
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + "X" + j + " = " + i*j);
//            }
//
//        }

//        100~200까지 수 중에서 가장 작은 소수를 출력하라
//        loop1:
//        for (int i = 100; i <= 200; i++) {
//            loop2:
//            for (int j = 2; j*j <= i; j++) {
//                if (i%j==0){
//                    continue loop1; // 소수가 아님. 다음 i로 넘어감.
//                }
//            }
//            // 여기까지 왔다는 건 소수라는 뜻
//            System.out.println(i);
//            break; // 가장 처음 나온 소수니까 출력하고 종료
//        }

//        for (int i = 100; i <= 200; i++) {
//            boolean check = false;
//            for (int j = 2; j * j <= i; j++) {
//                if (i % j == 0) {
//                    check = true;
//                    break;
//                }
//            }
//            if (!check) {
//                System.out.println(i + "이 가장 작은 소수입니다.");
//                break;
//            }
//        }


////        라벨문 : 반복문에 이름을 붙이는 것.
//        loop1:
//        for (int i = 0; i <10; i++) {
//            loop2:
//            for (int j = 0; j < 10; j++) {
//                if (true){
//                    break loop1; // 원하는 for문을 라벨링을 통해 종료시킬 수 있습니다.
//                }
//            }
//        }

//        이차원 배열
//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
//        System.out.println(arr[1][2]); //1번째 배열의 2번째 값을 찾는 것
//        숫자 11이 위치한 배열의 index값(1,2 또는 3,1) 출력
//        가장 먼저 찾아지는 11의 위치만 출력
//        라벨링 사용한 풀이
//        loop1:
//        for (int i = 0; i < arr.length; i++) {
//            loop2:
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println("위치는 : " + i + "," + j + "입니다.");
//                    break loop1;
//                }
//            }
//        }
////        라벨링 없는 풀이
//        boolean check = false;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 11) {
//                    check = true;
//                    System.out.println("위치는 : " + i + "," + j + "입니다.");
//                    break;
//                }
//            }
//            if (check) {
//                break;
//            }
//        }









    }
}