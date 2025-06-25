package C01BASIC;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for(char c='a'; c<='z'; c++){
            System.out.println(input.indexOf(c)+" ");
        }

    }
}
