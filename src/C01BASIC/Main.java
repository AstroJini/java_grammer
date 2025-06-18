import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] input = str.split("");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

//        무작위로 입력 받은 값들을 ArrayLIst로 받거나 배열로 받아냄
//        A수열의 i번째 값이 X보다 작은지 확인
//        작다면 답이 될 배열에 그 값을 추가

        int[] A = new int[N];
        int[] answer = {};

        for (int i = 0; i < N; i++) {
            A[i] += Integer.parseInt(input[i]);
        }

        for (int i = 0; i < N; i++) {
            if (A[i]<X){
                answer[i] += A[i];
            }
        }





    }
}
