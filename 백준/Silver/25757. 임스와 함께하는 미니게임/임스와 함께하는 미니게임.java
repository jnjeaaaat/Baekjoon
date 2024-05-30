import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);

        int playerNums = 0;
        if (game == 'Y') {
            playerNums = 1;
        } else if (game == 'F') {
            playerNums = 2;
        } else {
            playerNums = 3;
        }

        Set<String> set = new HashSet<>();
        int curPlayers = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            String player = br.readLine();

            if (!set.contains(player)) {
                curPlayers++;
                set.add(player);
            }

            if (curPlayers == playerNums) {
                curPlayers = 0;
                answer++;
            }

        }

        System.out.println(answer);

    }
}
