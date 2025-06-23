package C02ClassBasic;

import java.io.*;
import java.util.*;

public class Lotto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        boolean firstCase = true;


        while (!(line = br.readLine()).equals("0")) {
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

        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(myList, temp, target, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}