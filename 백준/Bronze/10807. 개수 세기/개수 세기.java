import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] frequency = new int[201];

        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            frequency[n+100]++;
        }

        int value = scanner.nextInt();

        System.out.println(frequency[value+100]);

    }
}