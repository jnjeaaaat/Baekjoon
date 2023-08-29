import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int cur = coins[i];

            if (cur <= k) {
//                System.out.println(cur);
                while (k >= cur) {

                    k -= cur;
                    count++;
//                    System.out.println("현재 돈 : " + k);
//                    System.out.println("카운트 : " + count);
                }
            }
        }

        System.out.println(count);
//        System.out.println(Arrays.toString(coins));
    }
}