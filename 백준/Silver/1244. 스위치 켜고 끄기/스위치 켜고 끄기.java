import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] switches = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < switches.length; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int students = Integer.parseInt(br.readLine());
        int gender = 0;
        int numOfSwitches = 0;
        for (int i = 0; i < students; i++) {
            st = new StringTokenizer(br.readLine());
            gender = Integer.parseInt(st.nextToken());
            numOfSwitches = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                int index = numOfSwitches;
                while (index < switches.length) {
                    changeLight(switches, index);
                    index += numOfSwitches;
                }

            } else {
                changeLight(switches, numOfSwitches); // 현재 위치 변경

                int left = numOfSwitches - 1;
                int right = numOfSwitches + 1;
                while (left > 0 && right < switches.length) {
                    if (switches[left] == switches[right]) {
                        changeLight(switches, left);
                        changeLight(switches, right);
                        left--;
                        right++;

                    } else {
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < switches.length; i++) {
            sb.append(switches[i]).append(" ");

            if (i % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }

    private static void changeLight(int[] arr, int index) {
        arr[index] = arr[index] == 1 ? 0 : 1;
    }

}
