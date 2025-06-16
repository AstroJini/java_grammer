package C01BASIC;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C09Map {
    public static void main(String[] args) {
////        key, value로 이루어진 자료구조
////        key값은 중복이 있으면 value를 덮어쓰기.
//            Map<String, String> sprots = new HashMap<>();
//            sprots.put("basketball", "농구"); ///이렇게 사용하면 비효율적
////
//            Map<String, Integer> sports = new HashMap<>();
//            sports.put("농구", 2);
//            sports.put("배구", 1); ///제거시에도 key값으로 제거
////        map은 key를 통해 value를 get
////        map에서 key값을 통한 검색 복잡도는 O(1)
//        System.out.println(sports.get("농구"));
//
////        map의 전체 데이터 출력
////        map의 key값 접근시에 인덱스 사용 불가능(순서가 없음)
////        keySet() : map의 key목록을 리턴하는 메서드
////        values() : map의 value목록을 리턴
//        System.out.println(sports.keySet());
//        System.out.println(sports.values());
//
//            int total = 0;
//            for (int v : sports.values()) {
//                    total += v;
//            }
//            int total2 = 0;
//            for (String k : sports.keySet()) {
//                    total2 += sports.get(k);
//            }
//            System.out.println(total);
//            System.out.println(total2);

//
//        //remove : 키를 통해 map의 요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);
//
//        //map에서 기존의 key값에 put할경우 덮어쓰기
//        sports.put("배구", 10);
//        System.out.println(sports);
//
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer","축구");
//        sports.put("baseball","야구");
//        sports.put("basketball","농구");
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer","운동");
//        sports.putIfAbsent("tennis","테니스");
//        System.out.println(sports);
//
////      containskey : 키가 있으면 true,  없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("pingpong"));
//
//
//        //map출력방법2가지 : 1.foreach문 | 2.iterator
//        //1.foreach문
//        for(String a : sports.keySet()){ // set의 값을 이용하여 출력
//            System.out.println(a); //key
//            System.out.println(sports.get(a)); //value
//        }
//        Set<String> mySet = sports.keySet();
//        for(String a : mySet){
//            System.out.println(a);
//        }

////        2. iterator를 통한 활용 | spring에서 다른 사람이 만든 코드가 Iterator로 쓰여져있는 게 꽤 존재
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer","축구");
//        sports.put("baseball","야구");
//        sports.put("basketball","농구");
//        Iterator<String> iterators = sports.keySet().iterator();
////        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iterators.next());
////        hasNext메서드는 iterator안에 그 다음값이 있는지 없는지 boolean 리턴
//        while(iterators.hasNext()){
//            System.out.println(iterators.next());
//        }
//
//        //map은 key의 value수를 count하는 목적으로 많이 활용
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        //농구:2, 축구:2, 야구:1
//        Map<String, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(myMap.containsKey(arr[i])){
//                myMap.put(arr[i],myMap.get(arr[i])+1);
//            }else {
//                myMap.put(arr[i],1);
//            }
//
//            //getOrDefault(키값,초기값) : key값 없을경우 초기값 리턴
//            myMap.put(arr[i], myMap.getOrDefault(arr[i],0)+1);
//        }
//        System.out.println(myMap);
//
//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
//        //축구:1
//        for(String r : removeArr){
//            if(myMap.containsKey(r)){
//                if(myMap.get(r)==1){
//                    myMap.put(r,myMap.get(r));
//                }else {
//                    myMap.put(r,myMap.get(r)-1);
//                }
//            }
//        }
//
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//        //가장 value가 큰 key값 찾기
//        int max = Integer.MIN_VALUE;
//        String maxKey = "";
//        for (String k : myMap.keySet()) {
//            if (myMap.get(k) > max) {
//                max = myMap.get(k);
//                maxKey = k;
//            }
//        }
//
//        System.out.println(maxKey);

//        백준 : 베스트셀러

//        프로그래머스 : 완주하지 못한 선수

//        TreeMap : key를 정렬(오름차순)하여 map에 저장
//        Map<String, Integer> treeMap = new TreeMap<>();///treemap의 값을 찾을 때의 복잡도는 O(1)이다.
//        treeMap.put("hello5", 1); ///treemap은 값을 할당할 때의 복잡도는 n log n이다.
//        treeMap.put("hello4", 2);
//        treeMap.put("hello3", 3);
//        treeMap.put("hello2", 4);
//        treeMap.put("hello1", 5);
//        for (String l : treeMap.keySet()) {
//            System.out.println(l);
//    }

//        백준 - 파일정리
//        문자열자르기 : .은 특수 문자로 취급되어 "." -> "\\."



    }
}
