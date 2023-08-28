import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            if (palindrome(s.substring(i))) {
                System.out.println(s.substring(i).length() + i*2);
                return;
            }
        }
    }

    public static boolean palindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
