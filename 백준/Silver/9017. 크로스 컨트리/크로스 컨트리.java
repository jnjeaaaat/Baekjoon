import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int n = 0;
        StringTokenizer st;

        for (int t = 0; t < T; t++) {

            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            Team[] teamArr = new Team[201];
            int[] rank = new int[n];
            for (int i = 0; i < n; i++) {
                int teamNum = Integer.parseInt(st.nextToken());

                rank[i] = teamNum;

                if (teamArr[teamNum] == null) {
                    teamArr[teamNum] = new Team(teamNum);
                } else {
                    teamArr[teamNum].players++;
                }

            }

            int curScore = 1;
            for (int i = 0; i < n; i++) {

                if (teamArr[rank[i]] == null || teamArr[rank[i]].players < 6) {
                    continue;
                }

                if (teamArr[rank[i]].teamCount < 4) {
                    teamArr[rank[i]].score += curScore;
                    teamArr[rank[i]].teamCount++;

                } else if (teamArr[rank[i]].teamCount == 4) {
                    teamArr[rank[i]].fifthScore = curScore;
                    teamArr[rank[i]].teamCount++;
                }

                curScore++;
            }

            List<Team> teamList = new ArrayList<>();
            for (int i = 1; i < teamArr.length; i++) {
                if (teamArr[i] == null || teamArr[i].score == 0) {
                    continue;
                }

                teamList.add(teamArr[i]);
            }

            Collections.sort(teamList);

            sb.append(teamList.get(0).teamNum).append("\n");

        }

        System.out.println(sb);

    }

    static class Team implements Comparable<Team> {
        int teamNum;
        int score = 0;
        int players = 1;
        int teamCount = 0;
        int fifthScore = 0;

        public Team(int teamNum) {
            this.teamNum = teamNum;
        }

        @Override
        public int compareTo(Team o) {
            int result = Integer.compare(this.score, o.score);
            if (result == 0) {
                result = Integer.compare(this.fifthScore, o.fifthScore);
            }

            return result;
        }
    }
}
