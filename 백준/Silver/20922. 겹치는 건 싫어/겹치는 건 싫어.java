import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] countNum = new int[100_001];
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < n) {

            if (countNum[nums[right]] + 1 <= k) {
                countNum[nums[right]]++;
                right++;
            } else {
                countNum[nums[left]]--;
                left++;
            }

            max = Math.max(max, right - left);
        }

        System.out.println(max);

    }
}
