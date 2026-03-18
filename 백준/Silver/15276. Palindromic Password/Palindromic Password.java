import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 6자리 팰린드롬인지 검사
    private static boolean isPalindrome(int num) {
        String s = String.valueOf(num);
        if (s.length() != 6) return false;  // 혹시 모를 안전장치

        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) != s.charAt(5 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            // 이미 팰린드롬이면 그대로
            if (isPalindrome(num)) {
                sb.append(num).append('\n');
                continue;
            }

            int lower = -1; // 아래쪽에서 찾은 팰린드롬
            int upper = -1; // 위쪽에서 찾은 팰린드롬

            // 아래쪽 탐색
            for (int x = num - 1; x >= 100000; x--) {
                if (isPalindrome(x)) {
                    lower = x;
                    break;
                }
            }

            // 위쪽 탐색
            for (int x = num + 1; x <= 999999; x++) {
                if (isPalindrome(x)) {
                    upper = x;
                    break;
                }
            }

            int answer;
            if (lower == -1) {              // 아래쪽 없음
                answer = upper;
            } else if (upper == -1) {       // 위쪽 없음
                answer = lower;
            } else {
                int diffLower = num - lower;
                int diffUpper = upper - num;

                if (diffLower < diffUpper) {
                    answer = lower;
                } else if (diffUpper < diffLower) {
                    answer = upper;
                } else {                     // 거리 같으면 더 작은 수
                    answer = lower;
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}