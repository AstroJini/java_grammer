package C01BASIC;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String line = br.readLine();
            int total = 0;
            int x =0;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'O'){
                    x++;
                    total+=x;
                }else {
                    x=0;
                }
            }
            System.out.println(total);
        }
    }
}
