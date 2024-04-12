import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Node> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        stack.push(new Node(1, Integer.parseInt(st.nextToken()))); // 처음값 삽입
        sb.append(0).append(" ");

        // 스택에 하나씩 넣으면서 바로 앞 값이랑 비교
        for (int i = 1; i < n; i++) {

            int a = Integer.parseInt(st.nextToken()); // 입력받은 수

            while (true) {

                Node pre = stack.peek(); // 처음값 확인

                if (pre.num < a) { // 작은게 계속 나오면
                    stack.pop(); // 계속 pop

                } else { // 큰게 나오면
                    stack.push(new Node(i + 1, a));
                    sb.append(pre.idx).append(" ");
                    break;
                }

                if (stack.isEmpty()) { // pop 하다가 하나도 안남게되면
                    sb.append(0).append(" ");
                    stack.push(new Node(i + 1, a));
                    break;
                }
            }

        }

        System.out.println(sb);
    }

    static class Node {
        int idx;
        int num;

        public Node(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }
}
