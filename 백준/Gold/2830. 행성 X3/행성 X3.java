import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] cases = new int[N];
        long answer = 0L;

        for (int i = 0; i < N; i++) {
            cases[i] = scanner.nextInt();
        }

        int[] oneCnt = new int[20];
        for (int i = 0; i < N; i++) {
            int j = 0;
            while (cases[i] != 0) {
                oneCnt[j] += cases[i] % 2;
                cases[i] /= 2;
                j++;
            }
        }

        for (int i = 0; i < oneCnt.length; i++) {
            answer += (1L << i) * oneCnt[i] * (N - oneCnt[i]);
        }

        System.out.println(answer);
    }
}
