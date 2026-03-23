import java.io.*
import java.util.StringTokenizer

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val points = Array(n) {
        val st = StringTokenizer(readLine())
        Point(st.nextToken().toInt(), st.nextToken().toInt())
    }

    points.sort()

    val sb = StringBuilder()
    repeat(n) { i ->
        sb.append(points[i].x).append(' ').append(points[i].y).append('\n')
    }

    print(sb)
}

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    override fun compareTo(other: Point): Int {
        val byY = y.compareTo(other.y)
        return if (byY != 0) byY else x.compareTo(other.x)
    }
}