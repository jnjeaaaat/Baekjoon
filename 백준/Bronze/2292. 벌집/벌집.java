import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int base = 1;
        int i = 1;
        while (true) {
            if (base >= n) {
                System.out.println(i);
                break;
            }
            base += (6 * i);
            i++;
        }
    }
}