package C01BASIC;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input =br.readLine().split(" ");
        int[] primeNumber = new int[N];
        for(int i=0; i< N; i++){
            primeNumber[i]=Integer.parseInt(input[i]);
        }
        for (int i = 0; i < N; i++) {
            if (primeNumber[i]<2){
                continue;
            }else if (primeNumber[i]% Math.sqrt(primeNumber[i])){

            }
        }
    }
}
