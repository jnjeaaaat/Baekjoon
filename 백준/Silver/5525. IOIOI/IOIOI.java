import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("I");
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String str = br.readLine();

        sb.append("OI".repeat(n));

        int count = 0;
        while (true) {
            int idx = str.indexOf(sb.toString());
            if (idx != -1) {
                count++;
                str = str.substring(idx + 1);
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}

// 티티벡 크림