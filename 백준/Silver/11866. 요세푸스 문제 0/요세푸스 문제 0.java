import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");
        String[] inputStr = br.readLine().split(" ");
        int N = Integer.parseInt(inputStr[0]);
        int K = Integer.parseInt(inputStr[1]);

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            deque.offer(i + 1);
        }

        while (!deque.isEmpty()) {
            for (int i = 1; i < K; i++) {
                deque.offer(deque.pollFirst());
            }

            if (deque.size() != 1) {
                sb.append(deque.pollFirst()).append(", ");
            } else {
                sb.append(deque.pollFirst());
            }
        }

        System.out.println(sb.append(">"));
    }
}