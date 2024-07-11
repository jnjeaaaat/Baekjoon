import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] buildings = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            buildings[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;

            double inclination = Integer.MAX_VALUE;
            double cur = 0; // 빌딩마다 기울기
            for (int j = i - 1; j >= 0; j--) {
                cur = (double) (buildings[i] - buildings[j]) / (i - j);

                if (j == (i - 1) || inclination > cur) { // 바로 양옆은 볼 수 있음
                    inclination = cur;
                    count++;
                }

            }

            inclination = Integer.MAX_VALUE;
            for (int j = i + 1; j < n; j++) {
                cur = (double) (buildings[i] - buildings[j]) / (j - i);

                if (j == (i + 1) || inclination > cur) {
                    inclination = cur;
                    count++;
                }

            }

            max = Math.max(max, count);
        }

        System.out.println(max);

    }
}
