package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C11RecursiveBasic {
//    아래 함수 출력 순서: 전c:0 -> 전c:1 -> 전c:2 -> 후c:3 -> 후c:2 -> 후c:1


    public static void main(String[] args) {
        recur1(0, 3);
        recur2(new ArrayList<>(), 0, 3);

    }
    public static void recur1(int count, int target) {
        if (count == target) {
            return;
        }
        System.out.println("재귀호출 전 count : " + count);
        count = count+1;
        recur1(count, target);
        System.out.println("재귀호출 후 count : " + count);
    }


//    객체를 매개변수로 활용한 재귀함수 : 객체는 힙메모리를 통해 원본객체가 변경될 수 있으므로, 재귀함수 간에 값이 일치되는 현상 발생
    public static void recur2(List<Integer> myList, int num, int target){
        if (myList.size() == target) {
            return;
        }
        myList.add(num); ///백트래킹

        recur2(myList, num+1, target);
        System.out.println(myList);///객체를 전달할 때는 메모리 주소 값을 통해 값을 변경 시키기 때문에 이를 주의해서 코딩해야함

    }
}