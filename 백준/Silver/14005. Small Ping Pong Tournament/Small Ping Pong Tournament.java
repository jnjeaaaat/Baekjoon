import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println("YES");
            System.exit(0);
        }

        int dudu = Integer.parseInt(br.readLine());

        int total = 1 << n;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < total; i++) {
            int x = Integer.parseInt(br.readLine());
            min = Math.min(x, min);
        }

        if (min <= dudu) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}