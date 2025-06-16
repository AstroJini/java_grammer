package C01BASIC;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        int[] nums = {3,1,2,3};
        int answer = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            set.add(a);
        }


        System.out.println(Math.min(answer,set.size()));



    }
}
