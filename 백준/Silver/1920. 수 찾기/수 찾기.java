import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());

            int left = 0;
            int right = N - 1;
            int mid = 0;
            while (left <= right) {
                mid = (left + right) / 2;

                if (arr[mid] > value) {
                    right = mid - 1;
                } else if (arr[mid] < value) {
                    left = mid + 1;
                } else {
                    break;
                }
            }
            
            if (arr[mid] == value) {
                sb.append('1').append('\n');
            } else {
                sb.append('0').append('\n');
            }
        }

        System.out.println(sb);
    }
}