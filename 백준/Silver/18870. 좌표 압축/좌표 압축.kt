fun main() {
    val n = readln().toInt()
    val str = readln().split(" ")
    val points = Array(n) { i ->
        Point(str[i].toInt(), i, 0)
    }

    points.sortBy { it.x }
    for (i in 1 until n) {
        if (points[i].x > points[i - 1].x) {
            points[i].rank = points[i - 1].rank + 1
        } else {
            points[i].rank = points[i - 1].rank
        }
    }

    points.sortBy { it.index }
    val sb = buildString {
        repeat(n) { i ->
            append(points[i].rank).append(' ')
        }
    }

    print(sb)
}


data class Point(val x: Int, val index: Int, var rank: Int)