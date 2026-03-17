import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            Deque<Document> dq = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int priority = Integer.parseInt(st.nextToken());
                dq.offer(new Document((char) ('A' + i), priority));
            }

            int count = 0;
            while (!dq.isEmpty()) {
                boolean flag = false;
                for (Document d : dq) {
                    if (dq.peekFirst().priority < d.priority) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    dq.offerLast(dq.pollFirst());
                } else {
                    count++;

                    if (dq.peekFirst().alpha == (char) ('A' + m)) {
                        break;
                    } else {
                        dq.pollFirst();
                    }
                }

            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    static class Document {
        char alpha;
        int priority;

        public Document(char alpha, int priority) {
            this.alpha = alpha;
            this.priority = priority;
        }
    }
}

