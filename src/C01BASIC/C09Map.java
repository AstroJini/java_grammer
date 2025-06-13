package C01BASIC;

import java.util.HashMap;
import java.util.Map;

public class C09Map {
    public static void main(String[] args) {
//        key, value로 이루어진 자료구조
//        key값은 중복이 있으면 value를 덮어쓰기.
//        Map<String, String> sprots = new HashMap<>();
//        sprots.put("basketball", "농구"); ///이렇게 사용하면 비효율적
//
        Map<String, Integer> sprots = new HashMap<>();
        sprots.put("농구", 2);
        sprots.put("배구", 1); ///제거시에도 key값으로 제거
//        map은 key를 통해 value를 get
//        map에서 key값을 통한 검색 복잡도는 O(1)

    }
}
