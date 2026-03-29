import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, n);
        find(size, r, c);
        System.out.println(count);
    }

    private static void find(int size, int r, int c) {
        if (size == 1)
            return;

        int half = size / 2;
        if (r < half && c < half) {
            find(half, r, c);
        } else if (r < half && c >= half) {
            count += (size * size) / 4 * 1;
            find(half, r, c - half);
        } else if (r >= half && c < half) {
            count += (size * size) / 4 * 2;
            find(half, r - half, c);
        } else {
            count += (size * size) / 4 * 3;
            find(half, r - half, c - half);
        }
    }
}