import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        // 1. Divide
        String front = str.substring(0, str.length() / 2);
        String back = str.substring(str.length() / 2);

        // 2. Rotate
        int frontRotate = 0;
        int backRotate = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            frontRotate += front.charAt(i) - 'A';
            backRotate += back.charAt(i) - 'A';
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length() / 2; i++) {
            sb1.append(alpha[(front.charAt(i) - 'A' + frontRotate) % 26]);
            sb2.append(alpha[(back.charAt(i) - 'A' + backRotate) % 26]);
        }

        front = sb1.toString();
        back = sb2.toString();

        // 3. Merge
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length() / 2; i++) {
            answer.append(alpha[(front.charAt(i) - 'A' + back.charAt(i) - 'A') % 26]);
        }

        System.out.println(answer);
    }
}