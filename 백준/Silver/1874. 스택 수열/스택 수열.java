import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int start = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > start) {
                for (int j = start + 1; j <= arr[i]; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = arr[i];
            } else if (stack.peek() != arr[i]) {
                System.out.println("NO");
                System.exit(0);
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}