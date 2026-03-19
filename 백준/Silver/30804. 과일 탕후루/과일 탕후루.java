import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] fruits = new int[10];
        int left = 0;
        int right = 0;
        int max = 0;
        int kindCount = 0;
        while (right < n) {
            int fruit = arr[right];

            if (fruits[fruit] == 0) {
                kindCount++;
            }
            fruits[fruit]++;

            while (kindCount > 2) {
                int leftFruit = arr[left];
                fruits[leftFruit]--;
                if (fruits[leftFruit] == 0) {
                    kindCount--;
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        System.out.println(max);
    }
}