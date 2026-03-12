import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        Stack<Character> stack;
        String str;
        for (int t = 0; t < T; t++) {
            stack = new Stack<>();
            str = br.readLine();

            for (char ch : str.toCharArray()) {
                if (stack.isEmpty() || ch == '(') {
                    stack.push(ch);
                } else if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                sb.append("NO");
            } else {
                sb.append("YES");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}