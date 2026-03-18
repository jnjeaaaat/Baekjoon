import java.io.*
import java.util.*

data class Point(
    val x: Int,
    val y: Int
) : Comparable<Point> {
    override fun compareTo(other: Point): Int {
        val result = x - other.x;
        return if (result == 0) y - other.y else result
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val points = Array(n) {
        val st = StringTokenizer(readLine())

        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        Point(x, y)
    }

    points.sort()

    val sb = StringBuilder()
    for (p in points) {
        sb.append(p.x).append(' ').append(p.y).append('\n')
    }

    print(sb);
}