import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) {
            queue.pollFirst();
            queue.offerLast(queue.pollFirst());
        }

        System.out.println(queue.poll());

    }
}
