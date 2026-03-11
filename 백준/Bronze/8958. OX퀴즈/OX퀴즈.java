import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String ox = br.readLine();
            int sum = 0;

            int n = 1;
            for (char ch : ox.toCharArray()) {
                if (ch == 'O') {
                    sum += n;
                    n++;
                } else {
                    n = 1;
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
