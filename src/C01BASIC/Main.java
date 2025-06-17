import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll()); // 앞에서 꺼내 뒤로
            }
            result.add(queue.poll()); // K번째 제거
        }

        // 출력 형식 맞추기
        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) System.out.print(", ");
        }
        System.out.println(">");
    }
}
