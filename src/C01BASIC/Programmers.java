package C01BASIC;

import java.util.*;

public class Programmers {
    public static void main(String[] args) {



//    class Solution {
//        public String solution(String my_string, String letter) {
//            String answer = "";
//            return answer;
//        }
//    }

//        프로그래머스-특정 문자 제거하기
//    public static void main(String[] args) {
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//
//        for (int i = 0; i < my_string.length(); i++) {
//            if (my_string.charAt(i) != letter) {
//                answer +=;
//            }
//        }
//        System.out.println(answer);
//    }//내가 쓴 답


//    public static void main(String[] args) {
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for (char c : my_string.toCharArray()) {
//            if (c!=letter.charAt(0)){
//                answer += c;
//            }
//        }
//        System.out.println(answer);
//    }//정답

//    subString으로 풀어보기
//    public static void main(String[] args) {
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (my_string.charAt(i)==letter) {
//                System.out.println(my_string.substring(0,i));
//            }
//        }
//        System.out.println(answer);
//        public static void main(String[] args) {
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (!my_string.substring(i,i+1).equals(letter)) {
//                answer += my_string.substring(i,i+1);
//            }
//        }
//        System.out.println(answer);

//    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//    s는 길이가 1 이상, 100이하인 스트링입니다.

//    로직
//    단어의 길이가 짝수인지 판별 짝수면 두글자 홀수면 한글자 출력
//    전체 길이의 절반의 위치의 값을 출력
//        class Solution {
//            public String solution(String s) {
//                String answer = "";
//                for (char ch : s.toCharArray()) {
//                    if (s.length()%2==0) {
//                        answer += s.charAt(s.length()/2-1);
//                        answer += s.charAt(s.length()/2);
//                        break;
//                    }else {
//                        answer += s.charAt(s.length()/2);
//                        break;
//                    }
//                }
//                return answer;
//            }
//        }


//    문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
//    이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
//    A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고
//    밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
//    0 < A의 길이 = B의 길이 < 100
////    A, B는 알파벳 소문자로 이루어져 있습니다.
////        우선 sb를 만들어두고 for문을 돌리면서 맨 뒤에걸 앞으로 가져와서 B문장과 맞는지 확인해야함



//        프로그래머스 - 두 개 뽑아서 더하기 : 조합 + 중복제거
//        정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
//        배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
//        numbers의 길이는 2 이상 100 이하입니다.
//        numbers의 모든 수는 0 이상 100 이하입니다.


//        int[] numbers = {2,1,3,4,1};
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : numbers){
//            mySet.add(a);
//        }
//        int[] solution = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet) {
//         solution[index] = a;
//         index++;
//        }
//        for (int i = 0; i < solution.length-1; i++) {
//
//            for (int j = i+1; j < solution.length; j++) {
//
//                solution[i] = solution[i] + solution[j];
//            }
//        }
//        System.out.println(Arrays.toString(solution)); // 틀림



//        int[] numbers = {2,1,3,4,1};
//        int index = 0;
//        int[] solution = new int[numbers.length];
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                solution[index]= numbers[i] + numbers[j];
//            }
//            index++;
//        }
//        System.out.println(Arrays.toString(solution)); // 틀림
//        my set으로 담으면서 동시에 넣어준 다음 결과값에 myset값 지정해주면 끝

//         행렬의 덧셈
//        행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//        2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//        행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        int index = 0;
        int[][] solution = new int[arr1.length][];
        for (int i = 0; i < solution.length; i++) {
            solution[index] = new int[arr1[i].length];
            index++;
            for (int j = 0; j < solution[i].length; j++) {
                solution[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(solution)); // 정답!!!!!!!!!!!!!!!!!!

//        class Solution {
//            public int[][] solution(int[][] arr1, int[][] arr2) {
//                int index = 0;
//                int[][] answer = new int[arr1.length][arr1[0].length];
//
//                for (int i = 0; i < answer.length; i++) {
//                    answer[index] = new int[arr1[i].length];
//                    index++;
//                    for(int j = 0; j < answer[i].length; j++) {
//                        answer[i][j] = arr1[i][j] + arr2[i][j];
//                    }
//                }
//
//                return answer;
//            }
//        }//프로그래머스 형 답안

//        K번째 수
//        배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//        예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//        array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//        1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//        2에서 나온 배열의 3번째 숫자는 5입니다.
//        배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
//        commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//        제한사항
//          array의 길이는 1 이상 100 이하입니다.
//          array의 각 원소는 1 이상 100 이하입니다.
//          commands의 길이는 1 이상 50 이하입니다.
//          commands의 각 원소는 길이가 3입니다.

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int [] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] arrayCut = new int[commands[i][1]-commands[i][0]+1];
            for (int j = 0; j < arrayCut.length; j++) {
//                값 담기
            }

        }

//         1. array배열에서 i, j값 만큼 자르기
//         2.자른 값 commands에 넣기
//         3. 잘라서 가져온걸 정렬
//         4. 정렬한 것 중에서 k번째 수 찾기

////      프로그래머스 - n의 배수 고르기
//        class Solution {
//            public int[] solution(int n, int[] numlist) {
//                List<Integer> myList = new ArrayList<>();
//                for (int i = 0; i < numlist.length; i++) {
//                    if (numlist[i]%n==0){
//                        myList.add(numlist[i]);
//                    }
//                }
//                int[] answer = new int[myList.size];
//                for (int i=0; i< )
//                    return answer;
//            }
//        }





//        프로그래머스 : 완주하지 못한 선수

//        프로그래머스 : 의상



//        프로그래머스: 폰켓몬
//        int[] nums = {3,1,2,3};
//        int answer = nums.length/2;
//        Set<Integer> set = new HashSet<>();
//        for (int a : nums) {
//            set.add(a);
//        }
//
//
//        System.out.println(Math.min(answer,set.size()));

//        프로그래머스 - 더 맵게
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int k = 7;
////        섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//        Queue<Integer> pq = new PriorityQueue<>();
//
//        for (int s : scoville) { /// 스코빌 배열을 pq에 옮겨 담기
//            pq.offer(s);
//        }
//        int count = 0; ///섞은 횟수 명시
//        while (pq.size() >= 2 && pq.peek() < k) { /// pq의 전체 갯수가 2이상(2가지 이상의 스코빌지수를 섞어야 하기 때문에)이고 pq의 최소값이 k보다 작을 동안 이 반복문을 실행
//            int x = pq.poll();
//            int y = pq.poll();
//            pq.offer(x + y * 2);
//            count++;
//        }
//
//        if (pq.peek() < k) { /// 예외처리
//            System.out.println(-1);
//        }
//        System.out.println(count);








    }
}
