import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Map<Integer, List<String>> map = new HashMap<>();
        Set<Integer> keySet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            keySet.add(age);
            if (map.get(age) == null) {
                map.put(age, new ArrayList<>());
            }
            map.get(age).add(name);
        }

        for (int key : keySet) {
            for (String name : map.get(key)) {
                sb.append(key).append(" ").append(name).append('\n');
            }
        }

        System.out.println(sb);
    }

}

