package C01BASIC;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int
        int[] nums = new int[9]; ///9개의 값을 갖는 배열 생성

        for (int i = 0; i < 9; i++) { /// 배열에 각 값 입력해주기
            int input = Integer.parseInt(br.readLine());
            nums[i]=input;
        }

        int index = 0; ///max값의 위치를 나타내는 변수
        int max = Integer.MIN_VALUE; ///max값을 나타내는 변수
        for (int i = 0; i < nums.length; i++) { /// 최대값 비교하기
            if (nums[i]>nums[index]){
                index = i;
                max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(index+1);

    }
}
