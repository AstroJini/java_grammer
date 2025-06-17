import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[br.read()];

        int total =0;
        for (int i = 0; i < input.length; i++) {
            total+= input[i];
        }
        System.out.println(input.length);
        System.out.println(total);

    }
}
