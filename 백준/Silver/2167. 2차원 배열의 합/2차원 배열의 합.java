import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N][M];

        for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
                matrix[n][m] = sc.nextInt();
            }
        }


        int K = sc.nextInt();

        
        for (int k = 0; k < K; k++) {
            int sum = 0;
            int I = sc.nextInt();
            int J = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            for (int i = I - 1; i < X; i++) {
                for (int j = J - 1; j < Y; j++) {
                    sum += matrix[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}
