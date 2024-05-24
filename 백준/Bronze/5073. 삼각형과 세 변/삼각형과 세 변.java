import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] nums = new int[3];
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
                sum += nums[i];
            }

            if (sum == 0) {
                break;
            }

            Arrays.sort(nums);

            if (nums[0] + nums[1] <= nums[2]) {
                System.out.println("Invalid");
            } else {
                if (nums[0] == nums[1] || nums[1] == nums[2]) {
                    if (nums[0] != nums[1] || nums[1] != nums[2]) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Equilateral");
                    }
                } else {
                    System.out.println("Scalene");
                }
            }

        }

    }
}
