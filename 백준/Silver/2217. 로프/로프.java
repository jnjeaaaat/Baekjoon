import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] ropes = new int[N];

        for (int i = 0; i < N; i++) {
            ropes[i] = scanner.nextInt();
        }
        ////////////////////////////////////////////////////////////

        Arrays.sort(ropes);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int sum = ropes[i] * (N - i);
            list.add(sum);
        }

        list.sort(Collections.reverseOrder());

        System.out.println(list.get(0));
    }
}