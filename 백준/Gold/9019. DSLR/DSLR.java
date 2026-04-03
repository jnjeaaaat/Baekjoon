import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(bfs(a, b)).append('\n');
        }

        System.out.println(sb);
    }

    private static String bfs(int start, int target) {
        boolean[] visited = new boolean[10_000];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, ""));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            int n = cur.value;

            if (n == target) {
                return cur.cmd;
            }

            // D 2배
            int d = (n * 2) % 10000;
            if (!visited[d]) {
                visited[d] = true;
                queue.add(new Node(d, cur.cmd + "D"));
            }
            // S -1
            int s = (n == 0) ? 9999 : n - 1;
            if (!visited[s]) {
                visited[s] = true;
                queue.add(new Node(s, cur.cmd + "S"));
            }
            // L 1000 자리 맨 뒤로 %1000, /1000
            int l = (n % 1000) * 10 + n / 1000;
            if (!visited[l]) {
                visited[l] = true;
                queue.add(new Node(l, cur.cmd + "L"));
            }
            // R 1의 자리 맨 앞으로 %10, /10
            int r = (n % 10) * 1000 + n / 10;
            if (!visited[r]) {
                visited[r] = true;
                queue.add(new Node(r, cur.cmd + "R"));
            }
        }

        return "";
    }

    static class Node {
        int value;
        String cmd;

        public Node(int value, String cmd) {
            this.value = value;
            this.cmd = cmd;
        }
    }
}