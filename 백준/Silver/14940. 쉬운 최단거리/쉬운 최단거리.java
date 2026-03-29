import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int[][] count = new int[n][m];

        Node start = new Node(0, 0);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());

                switch (board[i][j]) {
                    case 0:
                        count[i][j] = 0;
                        break;
                    case 1:
                        count[i][j] = -1;
                        break;
                    case 2:
                        count[i][j] = 0;
                        start = new Node(i, j);
                }
            }
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(start);

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (board[nx][ny] == 1 && count[nx][ny] == -1) {
                        count[nx][ny] = count[cur.x][cur.y] + 1;
                        queue.add(new Node(nx, ny));
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(count[i][j]).append(' ');
            }
            sb.append('\n');
        }
        
        System.out.println(sb);
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}