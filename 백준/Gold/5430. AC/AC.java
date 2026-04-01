import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        String method = "";
        int n = 0;
        StringTokenizer st;
        ArrayDeque<Integer> queue;
        for (int t = 0; t < T; t++) {
            method = br.readLine();
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            queue = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            boolean reverse = false;
            boolean error = false;

            for (int i = 0; i < method.length(); i++) {
                if (method.charAt(i) == 'R') {
                    reverse = !reverse;
                } else {
                    if (queue.isEmpty()) {
                        error = true;
                        break;
                    } else {
                        if (!reverse) {
                            queue.pollFirst();
                        } else {
                            queue.pollLast();
                        }
                    }
                }
            }

            if (error) {
                sb.append("error\n");
            } else {
                sb.append('[');
                if (!queue.isEmpty()) {
                    if (!reverse) {
                        Iterator<Integer> it = queue.iterator();
                        sb.append(it.next());
                        while (it.hasNext()) {
                            sb.append(',').append(it.next());
                        }
                    } else {
                        Iterator<Integer> it = queue.descendingIterator();
                        sb.append(it.next());
                        while (it.hasNext()) {
                            sb.append(',').append(it.next());
                        }
                    }
                }
                sb.append("]\n");
            }
        }

        System.out.println(sb);
    }
}