package C01BASIC;

import com.sun.source.tree.UsesTree;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
////        List 선언방법1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List 선언방법2 : 가장 일반적인 방법
//        List<String> myList3 = new LinkedList<>();
//
////        초기값 세팅방법1. 개별data add
//        myList3.add("Java");
//        myList3.add("Python");
//        myList3.add("C++");
//
//        System.out.println(myList3);
////        초기값 세팅방법2. 배열을 리스트로 변경
//        String[] arr = {"Java", "Python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myIntList = new ArrayList<>();
//        for(int i : intArr) {
//            myIntList.add(i); ///auto boxing이 일어난다
//        }

////        add 메서드: 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();///뒤로 하나씩 쌓이는 구조 중간
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30); ///List 는 중간 데이터 삽입/삭제 성능 비효율적.
//        System.out.println(myList);
//
////        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(0));
//
////        size() : 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());
//
//
////        for문을 활용해서 myList값 하나씩 모두 출력
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
////        for each활용 예시
//        for (int m : myList){
//            System.out.println(m);
//        }
//
////        remove : 요소삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        1)index를 통한 삭제 2)value를 통한 삭제 (일반적이지 않음)
//        myList.remove(0);/// for문으로 이걸 돌리면 범위를 myList.size()라고 정할 때 범위가 바뀔 수 있음
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
////        clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());
//
////        indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);
//        System.out.println(myList2.indexOf(30));
//
////        contains : 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList2.contains(20));

////        프로그래머스 - n의 배수 고르기
////        정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
////        numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
//
//
//        int n = 3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        List<Integer> myList = new ArrayList<>();
//        for (int i = 0; i < numlist.length; i++) {
//            if (numlist[i]%n==0){
//                myList.add(numlist[i]);
//            }
//        }
//        System.out.println(myList);

////        정렬 : 방법2가지 (Collections클래스 사용, 객체 사용불가)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
////        Collections.sort()
//        Collections.sort(myList, Comparator.reverseOrder()); ///내림차순
//        System.out.println(myList);
//
////        객체(ArrayList클래스)명.sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
//
////        이중리스트 : 리스트안의 리스트
////        [[1,2], [3,4] [5,6]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> myList1 =new ArrayList<>();
//        myList.add(myList1);
//        myList.add(new ArrayList<>()); /// 윗 문장과 같은의미
//        myList.get(0).add(1);
//        myList.get(0).add(2); /// [[1,2], []]
//        myList.get(1).add(3);
//        myList.get(1).add(4); ///[[1,2],[3,4]]
//

////        for문을 이용하여 [[1,2,3],[4,5,6],[7,8,9],[10,11,12]] 이중리스트 생성
//        List<List<Integer>> myList = new ArrayList<>();
//        int num = 1;
//        for (int i = 0; i < 4; i++) {
//            myList.add(new ArrayList<>());
//            for (int j = 0; j < 3; j++) {
//                myList.get(i).add(num);
//                num++;
//            }
//        }
//        System.out.println(myList);

//        리스트안에 배열
//        [{1,2}, {1,2,3}, {1,2,3,4}]
        List<int[]> myList2 = new ArrayList<>();
        myList2.add(new int[2]);
        myList2.get(0)[0]=1;
        myList2.get(0)[1]=2;
        myList2.add(new int[3]);
        myList2.get(1)[0]=1;
        myList2.get(1)[1]=2;
        myList2.get(1)[2]=3;
        myList2.add(new int[]{1,2,3,4});
        System.out.println(myList2); ///배열 주소값이 출력[첫번째 배열의 주소,두번째 배열의 주소,세번째 배열의 주소]
        for (int i = 0; i < myList2.size(); i++) {
            System.out.println(Arrays.toString(myList2.get(i)));
        }
        for (int[] m : myList2) {
            System.out.println(Arrays.toString(m));
        }





    }
}
