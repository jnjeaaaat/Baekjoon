import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();
        int[] numbers = new int[numCount];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Stack<Integer>[] stacks = new Stack[4];

        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean flag = false;

            for (int j = 0; j < stacks.length; j++) {
                if (!stacks[j].empty()) {
                    if (stacks[j].peek() < numbers[i]) {
                        stacks[j].push(numbers[i]);
                        flag = true;
                        break;
                    }
                } else {
                    stacks[j].push(numbers[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}