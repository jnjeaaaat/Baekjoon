import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static char[][] board;
    static int[][] count;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        board = new char[n][n];
        count = new int[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        List<Integer> cntList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '1' && count[i][j] == 0) {
                    cntList.add(bfs(i, j));
                }
            }
        }

        Collections.sort(cntList);

        for (int cnt : cntList) {
            sb.append(cnt).append('\n');
        }

        System.out.println(cntList.size());
        System.out.println(sb);
    }

    private static int bfs(int i, int j) {
        int cnt = 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        count[i][j] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (board[nx][ny] == '1' && count[nx][ny] == 0) {
                        queue.add(new int[]{nx, ny});
                        count[nx][ny] = count[cur[0]][cur[1]] + 1;
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}