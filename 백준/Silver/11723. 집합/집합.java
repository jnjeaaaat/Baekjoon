import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int bit = 0;

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("all")) {
                bit |= (~0);
            } else if (op.equals("empty")) {
                bit &= 0;
            } else {
                int x = Integer.parseInt(st.nextToken());

                if (op.equals("add")) {
                    bit |= 1 << (x - 1);
                } else if (op.equals("check")) { // 1 또는 0
                    sb.append((bit & (1 << (x - 1))) == 0 ? "0\n" : "1\n");
                } else if (op.equals("remove")) {
                    bit &= ~(1 << (x - 1));
                } else if (op.equals("toggle")) {
                    bit ^= (1 << (x - 1));
                }
            }

        }

        System.out.println(sb);


    }
}
