import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int x = 0;
            if (order.equals("push")) {
                x = Integer.parseInt(st.nextToken());
                queue.offer(x);
            } else if (order.equals("pop")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.pop()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            } else if (order.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (order.equals("empty")) {
                if (!queue.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(1).append('\n');
                }
            } else if (order.equals("front")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.peekFirst()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            } else if (order.equals("back")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.peekLast()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}