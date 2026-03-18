import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int fac = 1;
        for (int i = n; i > n - k; i--) {
            fac *= i;
        }
        for (int i = k; i > 0; i--) {
            fac /= i;
        }

        System.out.println(fac);
    }
}