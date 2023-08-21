import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();
        int inputNum;
        char ch = 0;
        boolean flag = true;
        int i = 0;

        while (flag) {

            if (i % 2 != 0) {
                inputNum = scanner.nextInt();

                switch (ch) {
                    case '+':
                        result += inputNum;
                        break;
                    case '-':
                        result -= inputNum;
                        break;
                    case '/':
                        result /= inputNum;
                        break;
                    case '*':
                        result *= inputNum;
                        break;
                }
            } else {
                ch = scanner.next().charAt(0);
                if (ch == '=') {
                    flag = false;
                }
            }

            i++;
        }

        System.out.println(result);
    }
}