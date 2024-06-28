import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[] location;
  static int N, M;

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    location = new int[M];
    for (int i = 0; i < M; i++) {
      location[i] = Integer.parseInt(st.nextToken());
    }

    int start = 1;
    int end = N;
    int result = 0;
    while (start <= end) {
      int mid = (start + end) / 2;

      if (check(mid)) {
        result = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    System.out.println(result);
  }

  static boolean check(int t) {
    int prev = 0;
    for (int i = 0; i < M; i++) {
      if (location[i] - t <= prev) {
        prev = location[i] + t;
      } else {
        return false;
      }
    }

    return N - prev <= 0;
  }

}
