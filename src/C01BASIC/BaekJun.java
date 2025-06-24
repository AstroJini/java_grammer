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


//        백준
//        package C01BASIC;
//
//import java.io.*;
//import java.util.*;
//
//        public class Main {
//            public static void main(String[] args) throws IOException {
//                BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
//                int N = Integer.parseInt(br.readLine()); ///EOF를 알기위해 첫째 줄에 주어지는 값을 읽어들임.
//
//
//                Queue<Integer> pq = new PriorityQueue<>((a, b) -> {
//                    int absA = Math.abs(a);
//                    int absB = Math.abs(b);
//                    if (absA == absB) return Integer.compare(a,b);
//                    else return Integer.compare(absA,absB);
//                }
//                );
//
//                StringBuilder sb = new StringBuilder();
//
//                for (int i = 0; i < N; i++) {
//                    int x = Integer.parseInt(br.readLine());
//                    if (x==0) {
//                        if(pq.isEmpty()) sb.append("0\n");
//                        else sb.append(pq.poll()).append("\n");
//                    }else {
//                        pq.add(x);
//                    }
//                }
//
//                System.out.println(sb);
//            }
//
//
//        }


////        백준 : 선 긋기
//
////        수열 정리한 리스트 생성
////        리스트정렬
////        값 산출
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        List<int[]> myList = new ArrayList<>();
//
//        for(int i=0; i<N; i++){
//            String[] line = br.readLine().split(" ");
//            int x = Integer.parseInt(line[0]);
//            int y = Integer.parseInt(line[1]);
//            myList.add(new int[]{x,y});
//        }
//
//        myList.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0]==o2[0]){ /// 시작지점이 같으면? 끝 기준으로 오름정렬
//                    return Integer.compare(o1[1],o2[1]);
//                }else{
//                    return Integer.compare(o1[0],o2[0]);
//                }
//            }
//        });
//
//        int total = 0;
//        int start = myList.get(0)[0];
//        int end = myList.get(0)[1];
//
//        for (int i=0; i<myList.size(); i++){
//            int nextStart = myList.get(i)[0];
//            int nextEnd = myList.get(i)[1];
//            if (nextStart<=end){ /// 다음 시작지점이 끝보다 작다면 같은 선상에 있는 거니까 병합
//                end = Math.max(end, nextEnd);
//            }else{ /// 지금까지의 길이 저장 후
//                total += end-start;
//                start=nextStart;
//                end=nextEnd;
//            }
//        }
//
//        total += end - start;
//        System.out.println(total);














    }
}
