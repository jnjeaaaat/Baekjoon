import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.add(new int[]{a, b});
        }


        for (int i = 0; i < N; i++) {
            int rate = 0;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (list.get(i)[0] < list.get(j)[0]
                            && list.get(i)[1] < list.get(j)[1]) {
                        rate++;
                    }
                }
            }
            sb.append(rate + 1).append(" ");
        }

        System.out.println(sb);

    }
}