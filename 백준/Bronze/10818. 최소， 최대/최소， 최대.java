import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt(); // 정수의 개수
        int[] numbers = new int[inputNum]; // 입력받는 정수 배열

        // 입력받은 숫자 numbers 에 삽입
        for (int i = 0; i < inputNum; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = 1000001;
        int max = -1000001;

        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println(min + " " + max);
    }
}