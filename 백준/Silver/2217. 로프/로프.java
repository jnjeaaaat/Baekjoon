import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] ropes = new int[N];

        for (int i = 0; i < N; i++) {
            ropes[i] = scanner.nextInt();
        }

        Arrays.sort(ropes);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, ropes[i] * (N - i));
        }

        System.out.println(max);
    }
}