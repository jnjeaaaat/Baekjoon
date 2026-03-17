import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean flag = false;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tmp = i;
            int sumEach = 0;
            while (tmp > 0) {
                sumEach += tmp % 10;
                tmp /= 10;
            }

            if (sumEach + i == N) {
                flag = true;
                ans = i;
                break;
            }
        }

        if (!flag) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}

