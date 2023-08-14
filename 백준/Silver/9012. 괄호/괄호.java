import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(solution(scanner.next()));
        }

    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
