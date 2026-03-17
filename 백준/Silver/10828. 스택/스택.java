import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int x = 0;
            if (order.equals("push")) {
                x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (order.equals("pop")) {
                if (!stack.empty()) {
                    sb.append(stack.pop()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            } else if (order.equals("size")) {
                sb.append(stack.size()).append('\n');
            } else if (order.equals("empty")) {
                if (!stack.empty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(1).append('\n');
                }
            } else if (order.equals("top")) {
                if (!stack.empty()) {
                    sb.append(stack.peek()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}

