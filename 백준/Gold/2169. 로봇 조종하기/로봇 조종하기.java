import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] board;
    static int[][] total;
    static int[][] temp;
    static int[] dx = {0, 0, 1};
    static int[] dy = {-1, 1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        total = new int[n][m];
        temp = new int[2][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        total[0][0] = board[0][0];
        for (int i = 1; i < m; i++) {
            total[0][i] = total[0][i - 1] + board[0][i];
        }

        for (int i = 1; i < n; i++) {
            temp[0][0] = total[i - 1][0] + board[i][0];
            for (int j = 1; j < m; j++) {
                temp[0][j] = Math.max(temp[0][j - 1], total[i - 1][j]) + board[i][j];
            }

            temp[1][m - 1] = total[i - 1][m - 1] + board[i][m - 1];
            for (int j = m - 2; j >= 0; j--) {
                temp[1][j] = Math.max(temp[1][j + 1], total[i - 1][j]) + board[i][j];
            }

            for (int j = 0; j < m; j++) {
                total[i][j] = Math.max(temp[0][j], temp[1][j]);
            }
        }

        System.out.println(total[n - 1][m - 1]);

    }
}
