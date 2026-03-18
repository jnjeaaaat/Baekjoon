import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] dp = new int[k + 1][n + 1];
            for (int i = 1; i < n + 1; i++) {
                dp[0][i] = i;
            }

            for (int i = 1; i < k + 1; i++) {
                for (int j = 1; j < n + 1; j++) {

                    int tmp = 0;
                    for (int p = 1; p < j + 1; p++) {
                        tmp += dp[i - 1][p];
                    }

                    dp[i][j] = tmp;
                }
            }

            sb.append(dp[k][n]).append('\n');
        }

        System.out.println(sb);
    }
}