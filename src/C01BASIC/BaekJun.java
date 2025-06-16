package C01BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJun {
    public static void main(String[] args) throws IOException {
//        백준 - 수찾기(1920)

//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int[] arr = new int[input];
//
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (input==arr[j]){
//                    System.out.println(j);
//                }
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int target = sc.nextInt();
//        int[] A = new int[n]; // 크기가 n인 배열 선언
//
//        for (int i = 0; i < n; i++) {
//            A[i] = sc.nextInt(); // 정수 n개 입력받아 배열에 저장
//        }
//        Arrays.sort(A);
//        System.out.println(Arrays.binarySearch(A,target));


//        백준 : 베스트셀러
//import java.util.*;
//
//        public class Main {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//
//                int n = Integer.parseInt(sc.nextLine()); // 첫 줄: 책 개수
//                Map<String, Integer> bookMap = new HashMap<>();
//
//                // 책 제목 입력받아 카운팅
//                for (int i = 0; i < n; i++) {
//                    String title = sc.nextLine();
//                    bookMap.put(title, bookMap.getOrDefault(title, 0) + 1);
//                }
//
//                // 가장 많이 팔린 책 찾기
//                int maxCount = 0;
//                String bestSeller = "";
//
//                for (String title : bookMap.keySet()) {
//                    int count = bookMap.get(title);
//
//                    if (count > maxCount) {
//                        maxCount = count;
//                        bestSeller = title;
//                    } else if (count == maxCount) {
//                        // 동률이면 사전순 비교
//                        if (title.compareTo(bestSeller) < 0) {
//                            bestSeller = title;
//                        }
//                    }
//                }
//
//                System.out.println(bestSeller);

//        백준 : 숫자카드
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashSet;
//import java.util.Set;
//
//        public class Q10815 {
//            public static void main(String[] args) throws IOException {
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                StringBuilder sb = new StringBuilder();
//
//                br.readLine();
//                String[] arr1 = br.readLine().split(" ");
//                br.readLine();
//                String[] arr2 = br.readLine().split(" ");
//
//                Set<String> set1 = new HashSet<>();
//                for(String a : arr1) {
//                    set1.add(a);
//                }
//
//                for(String a : arr2) {
//                    if(set1.contains(a)) {
//                        sb.append("1 ");
//                    } else {
//                        sb.append("0 ");
//                    }
//                }
//                sb.deleteCharAt(sb.length()-1);
//                System.out.println(sb);
//            }
//        }















    }
}
