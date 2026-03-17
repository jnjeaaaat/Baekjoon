import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        List<NumCount> numCounts = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            sum += num;
            list.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Collections.sort(list);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            numCounts.add(new NumCount(entry.getKey(), entry.getValue()));
        }

        numCounts.sort((o1, o2) -> {
            int result = Integer.compare(o2.howOften, o1.howOften);
            if (result != 0) {
                return result;
            }

            return Integer.compare(o1.num, o2.num);
        });

        System.out.println(Math.round((float) sum / N)); // 산술평균
        System.out.println(list.get(N / 2)); // 중앙값
        System.out.println(numCounts.size() < 2 ? numCounts.get(0).num :
                numCounts.get(0).howOften != numCounts.get(1).howOften ?
                        numCounts.get(0).num :
                        numCounts.get(1).num); // 최빈값
        System.out.println(list.get(N - 1) - list.get(0)); // 범위
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

