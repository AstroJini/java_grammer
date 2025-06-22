package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NandM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] input = str.split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            myList.add(i, i + 1);
        }
        List<List<Integer>> doubleList = new ArrayList<>();
        permu(myList, new ArrayList<>(), doubleList, M, new boolean[myList.size()]);
//        System.out.println(doubleList); ///이렇게 출력할 경우 백준에서 원하는 방식에 어긋나서 오답처리 됨

        for (List<Integer> list : doubleList){
            for(int nums: list){
                System.out.print(nums + " ");
            }
            System.out.println();
        }

    }
    public static void permu(List<Integer> myList, List<Integer> temp,List<List<Integer>> doubleList, int target,boolean[] visited) {
        if (temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(myList, temp, doubleList, target, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}

