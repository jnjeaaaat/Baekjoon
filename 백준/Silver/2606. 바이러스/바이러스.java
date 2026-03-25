import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] graph;
    static boolean[] isVirus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new int[n + 1][n + 1];
        isVirus = new boolean[n + 1];
        isVirus[1] = true;

        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(1);

        int count = 0;
        for (int i = 2; i < isVirus.length; i++) {
            if (isVirus[i]) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void dfs(int cur) {
        for (int i = 1; i < n + 1; i++) {
            if (i != cur && !isVirus[i] && graph[cur][i] == 1) {
                isVirus[i] = true;
                dfs(i);
            }
        }
    }
}