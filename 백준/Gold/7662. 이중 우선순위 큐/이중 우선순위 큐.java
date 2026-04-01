import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int n;
        char op;
        int num;
        StringTokenizer st;
        Queue<Integer> min;
        Queue<Integer> max;
        Map<Integer, Integer> map;
        for (int t = 0; t < T; t++) {
            min = new PriorityQueue<>();
            max = new PriorityQueue<>(Collections.reverseOrder());
            map = new HashMap<>();

            n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                op = st.nextToken().charAt(0);
                num = Integer.parseInt(st.nextToken());

                if (op == 'I') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    min.add(num);
                    max.add(num);
                } else {
                    if (map.isEmpty()) {
                        continue;
                    }

                    if (num == -1) {
                        remove(min, map);
                    } else {
                        remove(max, map);
                    }
                }
            }

            if (map.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                int result = remove(max, map);
                sb.append(result).append(' ');
                sb.append(!map.isEmpty() ? remove(min, map) : result).append('\n');
            }
        }

        System.out.println(sb);
    }

    private static int remove(Queue<Integer> queue, Map<Integer, Integer> map) {
        int cur = 0;
        boolean flag = false;
        while (!flag) {
            cur = queue.poll();

            int cnt = map.getOrDefault(cur, 0);

            if (cnt == 0) {
                continue;
            }

            if (cnt == 1) {
                map.remove(cur);
            } else {
                map.put(cur, cnt - 1);
            }

            flag = true;
        }

        return cur;
    }
}