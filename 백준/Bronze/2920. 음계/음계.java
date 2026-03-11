import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String str = "";
        for (int i = 1; i < 8; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp - n == 1) {
                str = "ascending";
            } else if (tmp - n == -1) {
                str = "descending";
            } else {
                str = "mixed";
                break;
            }

            n = tmp;
        }

        System.out.println(str);
    }
}
