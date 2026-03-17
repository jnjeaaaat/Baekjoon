import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] often = new int[8001];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            sum += arr[i];
            often[arr[i] + 4000]++;
        }

        Arrays.sort(arr);

        int max = 0;
        for (int i : often) {
            max = Math.max(max, i);
        }

        int idx = 0;
        boolean first = false;
        for (int i = 0; i < often.length; i++) {
            if (often[i] == max && first) {
                idx = i - 4000;
                break;
            } else if (often[i] == max) {
                first = true;
                idx = i - 4000;
            }
        }

        sb.append(Math.round((float) sum / N)).append('\n'); // 평균
        sb.append(arr[N / 2]).append('\n'); // 중앙값
        sb.append(idx).append('\n'); // 최빈값
        sb.append(arr[N - 1] - arr[0]); // 범위

        System.out.println(sb);
    }

    static class NumCount {
        int num;
        int howOften;

        public NumCount(int num, int howOften) {
            this.num = num;
            this.howOften = howOften;
        }
    }
}

