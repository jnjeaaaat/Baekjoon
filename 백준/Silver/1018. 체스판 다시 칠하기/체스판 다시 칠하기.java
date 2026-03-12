import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int Bcnt = 0;
                int Wcnt = 0;
                for (int di = i; di < i + 8; di++) {
                    for (int dj = j; dj < j + 8; dj++) {
                        if ((di + dj) % 2 == 0) {
                            if (arr[di][dj] != 'B') Bcnt++;
                            if (arr[di][dj] != 'W') Wcnt++;
                        } else {
                            if (arr[di][dj] != 'W') Bcnt++;
                            if (arr[di][dj] != 'B') Wcnt++;
                        }
                    }
                }
                ans = Math.min(Math.min(Bcnt, Wcnt), ans);
            }
        }

        System.out.println(ans);
    }
}