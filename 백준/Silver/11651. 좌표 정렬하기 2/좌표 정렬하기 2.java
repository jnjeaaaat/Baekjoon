import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(x, y);
        }

        Arrays.sort(points);

        for (Point p : points) {
            sb.append(p.x).append(' ').append(p.y).append('\n');
        }

        System.out.println(sb);
    }

    private static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            int result = Integer.compare(this.y, o.y);
            return result != 0 ? result : Integer.compare(this.x, o.x);
        }
    }
}