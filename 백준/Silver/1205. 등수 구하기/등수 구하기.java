import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int taesu = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(1);
            return;
        }

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        // 배열크기 N 과 랭킹최대크기 P가 같으면서 ,
        // 랭킹 리스트의 가장 작은 순위보다 새로운 스코어가 작다면 랭킹에 진입X
        if (n == p && taesu <= list.get(list.size() - 1)) {
            System.out.println(-1);
            return;
        }

        int rank = 1; //등수
        for (int i = 0; i < list.size(); i++) {
            if (taesu < list.get(i)) {
                rank++;
                continue;
            }

            break;
        }

        System.out.println(rank);
    }
}
