import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] line = new int[w];
        st = new StringTokenizer(br.readLine());

        int max = 0;
        int left = 0;
        int leftIdx = 0;
        int right = 0;
        int rightIdx = 0;
        int maxIdx = 0;
        for (int i = 0; i < line.length; i++) {
            line[i] = Integer.parseInt(st.nextToken());

            if (left == 0) {
                left = line[i];
                leftIdx = i;
            }

            if (line[i] > max) {
                max = line[i];
                maxIdx = i;
            }

            if (line[i] != 0) {
                rightIdx = i;
            }
        }

        int sum = 0;
        max = line[leftIdx];
        for (int i = leftIdx + 1; i < maxIdx; i++) {

            if (line[i] > max) {
                max = line[i];
                continue;
            }

            sum += (max - line[i]);
        }

        max = line[rightIdx];
        for (int i = rightIdx - 1; i > maxIdx; i--) {

            if (line[i] > max) {
                max = line[i];
                continue;
            }

            sum += (max - line[i]);
        }

        System.out.println(sum);
    }
}
