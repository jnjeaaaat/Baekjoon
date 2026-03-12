import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(GCD(a, b));
        System.out.println((long) a * (long) b / GCD(a, b));
    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return GCD(b, a % b);
    }
}
