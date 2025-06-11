package C01BASIC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
////       출력 : System.out을 통해 콘솔 출력
//        System.out.println(20); // 줄바꿈 있는 출력
//        System.out.print("hello world1"); // 줄바꿈 없는 출력
//        System.out.print("hello world2");
////        기능 집합 = 클래스
////        입력: Scanner클래스 : 입력을 위한 클래스, System.in : 키보드 입력
//
//        Scanner myScanner = new Scanner(System.in);
//        String input = myScanner.nextLine(); // 입력받은 데이터를 한 줄로 읽어서 String으로 리턴
//        System.out.println("입력사항 : " + input);
//
////        예를 들어 아래와 같은 입력값이 주어질 때 처리 방법
//        /*
//            abc
//            bcd
//            2
//         */
////       입출력에는 전부 문자열이라는 것이 대전제
//        Scanner myScanner2 = new Scanner(System.in);
//        String input1 = myScanner2.nextLine();
//        String input2 = myScanner2.nextLine();
//        int input3 = myScanner2.nextInt();
//        System.out.println("입력사항 : " + input1);
//        System.out.println("입력사항 : " + input2);
//        System.out.println("입력사항 : " + input3);
//
////        입력 : BufferedReader + System.in
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        String input1 = br1.readLine(); // 한 줄씩 읽어서 문자열로 리턴
//        System.out.println(input1);
//
////        입력값 : abc bcd fgd
//        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//        String input2 =br2.readLine(); //문자열 객체로 가져오기 때문에 변수값에 .을 쓰면 기능들이 나오는 것
//        String[] arr = input2.split(" ");
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//
////        BufferedReader + System.in + StringTokenizer
//        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
//        String input3 = br3.readLine();
//        StringTokenizer st = new StringTokenizer(input3);
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
    }
}
