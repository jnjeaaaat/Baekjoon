import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack;
        String str;
        while (!(str = br.readLine()).equals(".")) {
            stack = new Stack<>();

            for (int i = 0; i < str.length() - 1; i++) {
                char cur = str.charAt(i);

                if (cur == '(' || cur == ')' || cur == '[' || cur == ']') {
                    if (stack.empty() || cur == '(' || cur == '[') {
                        stack.push(cur);
                    } else {
                        if (cur == ')') {
                            if (stack.peek() != '(') {
                                break;
                            } else {
                                stack.pop();
                            }
                        } else if (cur == ']') {
                            if (stack.peek() != '[') {
                                break;
                            } else {
                                stack.pop();
                            }
                        }
                    }
                }

            }

            if (stack.empty() && str.charAt(str.length() - 1) == '.') {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }

        System.out.println(sb);
    }
}