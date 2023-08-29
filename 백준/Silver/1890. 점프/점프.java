import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] board = new int[N+1][N+1];
        long[][] dp = new long[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        dp[1][1] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int next = board[i][j];

                if (next == 0) {
                    break;
                }

                if (i + next <= N) {
                    dp[i + next][j] += dp[i][j];
                }
                if (j + next <= N) {
                    dp[i][j + next] += dp[i][j];
                }
            }
        }

        System.out.println(dp[N][N]);

    }
}
