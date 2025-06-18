import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            if (input >=90 && input<=100) {
                System.out.println("A");
                break;
            } else if (input >=80 && input <= 89) {
                System.out.println("B");
                break;
            } else if (input >=70 && input <= 79) {
                System.out.println("C");
                break;
            } else if (input >=60 && input <= 69){
                System.out.println("D");
                break;
            } else {
                System.out.println("F");
                break;
            }
        }
    }
}
