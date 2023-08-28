import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 0;
        int sum = 0;
        int p1 = 0;
        int p2 = 0;
        while (true) {
            if (sum > K) {
                sum -= numbers[p2++];
            } else if (p1 == numbers.length) {
                break;
            } else {
                sum += numbers[p1++];
            }

            if (sum == K) {
                count++;
            }
        }

        System.out.println(count);
    }
}
