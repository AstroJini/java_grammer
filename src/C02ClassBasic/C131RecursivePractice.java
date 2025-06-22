package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C131RecursivePractice {
    public static void main(String[] args) {
//        재귀함수 예제 : 조합
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

//        숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
//        [[1,2], [1,3], [1,4], [2,3], [2,4], [3,4]]
//        List<List<Integer>> doubleList = new ArrayList<>();
//
//        for (int i=0; i < myList.size(); i++){
//            for(int j=0; j<myList.size(); j++){ /// int j=0으로 조건을 두면 순열, i+1로 설정하면 조합!!
////                값 조립
//                List<Integer>temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                doubleList.add(temp);
//            }
//        }
//        System.out.println(doubleList);
//
////        재귀 함수를 만들기 위한 for문 변경
//        List<List<Integer>> doubleList = new ArrayList<>(); ///출력할 결과물로 삼을 이중리스트 생성
//        List<Integer>temp = new ArrayList<>(); ///이중 리스트에 담을 각 리스트 생성 [1,2] ...
//        for(int i=0; i<myList.size(); i++){
//            temp.add(myList.get(i));///반복문 활용해서 1번째 값을 처음으로 넣어줌
//            for (int j = i+1; j < myList.size(); j++) {
//                temp.add(myList.get(j));/// i번째 값과 i+1값을 넣은 값을 리스트에 추가
//                doubleList.add(new ArrayList<>(temp)); ///결과물에 i번째와 i+1번째 값을 추가한걸 저장
//                temp.remove(temp.size()-1);///마지막으로 추가한 값을 없에주어 새 값을 받을 준비
//            }
//            temp.remove(temp.size()-1); /// 백트래킹
//        }
//        System.out.println(doubleList);

//        combi(myList, new ArrayList<>(), doubleList, 3, 0);
//        System.out.println(doubleList);

    }
//    List<Integer>myList=조합식을 사용할 리스트
//    List<Integer>temp=조합식을 담아둘 리스트
//    List<List<Integer>> doubleList = 결과값을 담을 2중 리스트
//    target = 재귀함수를 멈춰주는 지점
//    start = 재귀함수로 for문이 반복될 때 다음 for문이 시작해야하는 지점

//    static void combi(List<Integer>myList, List<Integer>temp,List<List<Integer>>doubleList, int target, int start) {
//        if (temp.size()==target){
//            doubleList.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = start; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            combi(myList, temp, doubleList, target, i+1);
//            temp.remove(temp.size()-1);
//        }
//    }


//    public static void combi (List<Integer>myList, List<Integer>temp, List<List<Integer>>doubleList, int target, int start) {
//        if (temp.size()==target){
//            doubleList.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i= start; i<myList.size(); i++){
////            임시로 담을 리스트에 추가
//            temp.add(myList.get(i));
////            재귀함수 다시 부르면서 시작점 변경
//            combi(myList, temp, doubleList, target, i+1);
////            마지막으로 넣었던 값 빼주기
//            temp.remove(myList.get(i));
//        }


    }









}
