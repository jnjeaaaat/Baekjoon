import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            sb.append(n * (n + 1) / 2).append(' ')
                    .append((int) Math.pow(n, 2)).append(' ')
                    .append(n * (n + 1)).append('\n');
        }

        System.out.println(sb);
    }
}