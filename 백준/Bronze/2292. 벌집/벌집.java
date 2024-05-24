import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(1);
            System.exit(0);
        }

        int sum = 1;
        int count = 1;
        while (sum < n) {
            sum += (count * 6);
            count++;
        }

        System.out.println(count);
    }
}
