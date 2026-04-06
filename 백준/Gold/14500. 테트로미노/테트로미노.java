import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] board;
    static boolean[][] visited;
    static int max = 0;
    static int maxValue = 0;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());

                if (maxValue <= board[i][j]) {
                    maxValue = board[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, board[i][j]);
                visited[i][j] = false;

                checkT(i, j);
            }
        }

        System.out.println(max);
    }

    private static void dfs(int x, int y, int cnt, int sum) {
        if (cnt == 4) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (!isRange(nx, ny)) continue;
            if (visited[nx][ny]) continue;

            visited[nx][ny] = true;
            dfs(nx, ny, cnt + 1, sum + board[nx][ny]);
            visited[nx][ny] = false;
        }
    }

    private static void checkT(int x, int y) {
        int[] wing = new int[4];
        int wings = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny)) {
                wings++;
                wing[i] = board[nx][ny];
            }
        }

        if (wings < 3) {
            return;
        }

        int sumWings = board[x][y];
        for (int i = 0; i < 4; i++) {
            sumWings += wing[i];
        }

        for (int i = 0; i < 4; i++) {
            max = Math.max(max, sumWings - wing[i]);
        }
    }

    private static boolean isRange(int nx, int ny) {
        return nx >= 0 && nx < n && ny >= 0 && ny < m;
    }
}