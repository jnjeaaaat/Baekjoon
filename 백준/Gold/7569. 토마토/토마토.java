import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m, h;
    static int[][][] box;
    static Queue<Tomato> queue = new LinkedList<>();

    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        box = new int[h][n][m];
        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    box[k][i][j] = Integer.parseInt(st.nextToken());
                    if (box[k][i][j] == 1) {
                        queue.add(new Tomato(i, j, k, 0));
                    }
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {

        int day = 0;

        while (!queue.isEmpty()) {
            Tomato cur = queue.poll();
            day = cur.day;

            for (int d = 0; d < 6; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];
                int nz = cur.z + dz[d];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && nz >= 0 && nz < h) {
                    if (box[nz][nx][ny] == 0) {
                        box[nz][nx][ny] = 1;
                        queue.add(new Tomato(nx, ny, nz, day + 1));
                    }
                }
            }
        }

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (box[k][i][j] == 0) {
                        return -1;
                    }
                }
            }
        }

        return day;
    }

    static class Tomato {
        int x;
        int y;
        int z;
        int day;

        public Tomato(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }
}