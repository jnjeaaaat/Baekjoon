import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static char BStart = 'B';
    static char WStart = 'W';
    static int Bcnt, Wcnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                Bcnt = 0;
                Wcnt = 0;
                for (int di = i; di < i + 8; di++) {
                    for (int dj = j; dj < j + 8; dj++) {
                        count(di, dj);
                        switchColor();
                    }
                    switchColor();
                }
                ans = Math.min(Math.min(Bcnt, Wcnt), ans);
            }
        }

        System.out.println(ans);
    }

    static void count(int x, int y) {
        if (arr[x][y] != BStart) {
            Bcnt++;
        }

        if (arr[x][y] != WStart) {
            Wcnt++;
        }
    }

    static void switchColor() {
        if (BStart == 'B') {
            BStart = 'W';
        } else {
            BStart = 'B';
        }

        if (WStart == 'B') {
            WStart = 'W';
        } else {
            WStart = 'B';
        }
    }
}