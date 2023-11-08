import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String str = scanner.next();
        String[] strArr = str.split(",");
        int[] orgArr = new int[N];
        int arrLen = N - 1;

        for (int i = 0; i < N; i++) {
            orgArr[i] = Integer.parseInt(strArr[i]);
        }

        for (int i = 0; i < K; i++) {
            int[] tempArr = new int[arrLen];

            for (int j = 0; j < arrLen; j++) {
                tempArr[j] = orgArr[j+1] - orgArr[j];
            }
            arrLen--;
            orgArr = tempArr.clone();
        }

        for (int i = 0; i < orgArr.length - 1; i++) {
            System.out.print(orgArr[i] + ",");
        }
        System.out.println(orgArr[orgArr.length - 1]);
    }
}