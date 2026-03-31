import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] pokeDex = new String[n + 1];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            String pokeMon = br.readLine();
            pokeDex[i] = pokeMon;
            map.put(pokeMon, i);
        }

        for (int i = 0; i < m; i++) {
            String temp = br.readLine();
            if (isNumber(temp.charAt(0))) {
                int idx = Integer.parseInt(temp);
                sb.append(pokeDex[idx]);
            } else {
                sb.append(map.get(temp));
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static boolean isNumber(char ch) {
        return '1' <= ch && ch <= '9';
    }
}