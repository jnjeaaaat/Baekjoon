import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int[] parents;
    public static ArrayList<Integer>[] list;
    public static int N;
    public static boolean isVisit[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        parents = new int[N+1];
        isVisit = new boolean[N+1];
        list = new ArrayList[N+1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }
    }

    public static void dfs(int index) {
        isVisit[index] = true;

        for (int i : list[index]) {
            if (!isVisit[i]) {
                parents[i] = index;
                dfs(i);
            }
        }
    }
}
