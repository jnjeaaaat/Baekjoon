import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            List<int[]> dp = new ArrayList<>();
            dp.add(new int[n + 1]);
            for (int i = 1; i < n + 1; i++) {
                dp.get(0)[i] = i;
            }

            for (int i = 1; i < k; i++) {
                dp.add(new int[n + 1]);
                for (int j = 1; j < n + 1; j++) {

                    int tmp = 0;
                    for (int p = 1; p < j + 1; p++) {
                        tmp += dp.get(i - 1)[p];
                    }

                    dp.get(i)[j] = tmp;
                }
            }

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += dp.get(k - 1)[i];
            }

            sb.append(sum).append('\n');
        }

        System.out.println(sb);
    }
}