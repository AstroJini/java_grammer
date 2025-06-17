package C01BASIC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
////        Queue인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll: queue에서 데이터를 삭제하면서 동시에 return하는 메서드
//        int temp = myQue.poll(); // 10
//        System.out.println(temp);
//        System.out.println(myQue); // 20, 30
////        peek : queue에서 데이터를 삭제하지 않고 가장 앞의 데이터를 반환
//        int temp2 = myQue.peek(); // 20
//        System.out.println(temp2);
//        System.out.println(myQue); // 20,30
//
////        LinkedList와 ArrayList의 성능차이 비교
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            linkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList에 값 중간add 시에 소요시간 : " + (endTime-startTime));
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(0,i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList에 값 중간add 시에 소요시간 : " + (endTime-startTime));
//
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");
//        for (int i = 0; i <myQue.size(); i++) { /// i의 값은 계속 커지고 myQue.size()의 값은 점점 줄어들기 때문에 이런식으로 하면 전체 출력 불가
//            System.out.println(myQue.poll());
//        }
////        Queue는 일반적으로 while을 통해 요소 소모
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll()); ///queue는 계속해서 값이 추가되기 때문에 while문을 사용하여 전체 출력해야한다.
////        2개씩 poll할 경우에는 queue가 empty가 되지 않도록 유의.
//        }

//        백준 : 카드 2
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            Queue<Integer> card = new LinkedList<>();
//            int n = Integer.parseInt(br.readLine());
//
//            // 1번부터 n번 카드 넣기
//            for (int i = 1; i <= n; i++) {
//                card.add(i);
//            }
//
//            // 카드가 한 장 남을 때까지 반복
//            while (card.size() > 1) {
//                card.poll(); // 맨 위 카드 버리기
//                card.add(card.poll()); // 다음 카드 맨 아래로
//            }
//
//            // 마지막 남은 카드 출력
//            System.out.println(card.peek());
//        }
//    }

//        백준 : 요세푸스 문제 0
//        숫자를 세야함
//        K번째 사람을 제거하고 그 앞에 있던 사람들을 뒤로 보내줘야함
//        queue는 일직선상에 있다고 생각하고 풀어야함

////        길이제한 queue
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3); /// add를 사용하면 에러 발생
////        offer : 제한된 길이까지만 insert
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

////        우선순위 queue : 데이터를 poll할 때 정렬된 데이터 결과값 보장
////        전체 데이터가 계속해서 변경되면서 지속적으로 최소값을 추출해야 하는 경우.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);/// n개의 데이터
//        System.out.println(pq); ///add할 때 까지는 전체 정렬이 돼 있지 않음
//        while (!pq.isEmpty()) { /// 정렬시 복잡도 n log n
//            System.out.println(pq.poll()); /// 1개씩 poll 할 때마다 최소값을 뽑아낸다 | log (n)의 복잡도
//        }

////        백준 - 최소힙
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int totalCount = Integer.parseInt(br.readLine());
//        Queue<Integer> pq = new PriorityQueue<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < totalCount; i++) {
//            int input = Integer.parseInt(br.readLine());
//            if (input==0){
//                if (pq.isEmpty()) {
//                    sb.append(0);
//                    sb.append("\n");
//                }else {
//                    sb.append(pq.poll());
//                    sb.append("\n");
//                }
//            }else {
//                pq.add(input);
//            }
//
//        }
//        System.out.println(sb);

////        백준 - 최대힙
//        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
//        pq2.add(30);
//        pq2.add(20);
//        pq2.add(10);
//        pq2.add(40);
//        pq2.add(50);
//        System.out.println(pq2);
//        while (!pq2.isEmpty()) {
//            System.out.println(pq2.poll());
//        }

//        프로그래머스 - 더 맵게


//        stack : 후입선출
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); ///제거 되면서 값 return
        System.out.println(stack.peek()); /// 값만 return
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

//        프로그래머스 : 같은 숫자는 싫어

//        프로그래머스 : 올바른 괄호

//        deque : addFirst, addLast, pollLast, pollFirst, peekFirst, peekLast
        Deque<Integer>d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        d1.addFirst(30);
        System.out.println(d1.pollLast()); ///20
        System.out.println(d1.pollFirst()); ///30
        System.out.println(d1.peekLast()); ///10

//        복잡한정렬 : Comparable, Comparator
//        재귀함수 : 재귀, dfs, 백트래킹
//        주요알고리즘 : dfs/bfs, DP, 이분탐색, 투포인터

//        주요자료구조 : 배열, 리스트, map, set, 큐, 스택, deque
//        문자열문제와 주요자료구조에 관한 문제를 많이 풀어보길 추천함

    }
}
