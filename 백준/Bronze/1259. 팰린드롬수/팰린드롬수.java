import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num;
        while ((num = Integer.parseInt(br.readLine())) != 0) {
            if (palindrome(num)) {
                sb.append("yes");
            } else {
                sb.append("no");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }

    static boolean palindrome(int num) {
        String str = String.valueOf(num);
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}