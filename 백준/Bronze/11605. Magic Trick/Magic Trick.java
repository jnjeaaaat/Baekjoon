import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Op {
        String op;
        int x;

        public Op(String op, int x) {
            this.op = op;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Op[] ops = new Op[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String op = st.nextToken();
            int x = Integer.parseInt(st.nextToken());

            ops[i] = new Op(op, x);
        }

        int count = 0;
        for (int k = 1; k <= 100; k++) {
            int cur = k;
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                String op = ops[i].op;
                int x = ops[i].x;

                if (op.equals("ADD")) {
                    cur += x;
                } else if (op.equals("SUBTRACT")) {
                    cur -= x;
                    if (cur < 0) {
                        flag = true;
                        break;
                    }
                } else if (op.equals("MULTIPLY")) {
                    cur *= x;
                } else if (op.equals("DIVIDE")) {
                    if (cur % x != 0) {
                        flag = true;
                        break;
                    }
                    cur /= x;
                }
            }


            if (flag) {
                count++;
            }
        }

        System.out.println(count);
    }
}