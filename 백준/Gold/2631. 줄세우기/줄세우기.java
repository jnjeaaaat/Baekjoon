import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] line = new int[n];
        for (int i = 0; i < n; i++) {
            line[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n]; // 각 위치의 숫자에 대한 오름차순 최장길이
        Arrays.fill(dp, 1);

        int max = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (line[j] < line[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(n - max);

    }
}
