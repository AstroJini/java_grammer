package C02ClassBasic;

import java.io.*;
import java.util.*;

public class Lotto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        boolean firstCase = true;

        // 각 테스트 케이스별로 처리
        while (!(line = br.readLine()).equals("0")) {
            // 테스트 케이스 사이에 빈 줄 출력 (첫 번째 케이스 제외)
            if (!firstCase) {
                System.out.println();
            }
            firstCase = false;

            StringTokenizer st = new StringTokenizer(line);
            int k = Integer.parseInt(st.nextToken());

            List<Integer> myList = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                myList.add(Integer.parseInt(st.nextToken()));
            }

            // 조합 생성 및 출력 (목표는 6개 고정)
            combi(myList, new ArrayList<>(), 6, 0);
        }
    }

    public static void combi(List<Integer> myList, List<Integer> temp, int target, int start) {
        if (temp.size() == target) {
            for (int i = 0; i < temp.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(temp.get(i));
            }
            System.out.println();
            return;
        }

        // 재귀 호출: start 인덱스부터 끝까지 각 숫자를 선택해보기
        for (int i = start; i < myList.size(); i++) {
            // 현재 숫자를 조합에 추가
            temp.add(myList.get(i));

            // 다음 위치부터 재귀 호출 (i+1로 중복 방지)
            combi(myList, temp, target, i + 1);

            // 백트래킹: 현재 숫자를 조합에서 제거
            temp.remove(temp.size() - 1);
        }
    }
}