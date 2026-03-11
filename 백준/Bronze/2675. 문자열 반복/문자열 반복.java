import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // test case T
        // 반복수 n, 반복한 문자열 str

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n;
        String str;

        var T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            str = st.nextToken();

            for (char ch : str.toCharArray()) {
                for (int i = 0; i < n; i++) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
