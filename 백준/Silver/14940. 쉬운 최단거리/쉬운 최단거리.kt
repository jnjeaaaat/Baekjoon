fun main() {
    val (n, m) = readln().split(" ").map(String::toInt)
    val map = Array(n) { IntArray(m) }
    val count = Array(n) { IntArray(m) }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    var start = 0 to 0
    for (i in map.indices) {
        val strArr = readln().split(" ")
        for (j in map[i].indices) {
            map[i][j] = strArr[j].toInt()

            when (map[i][j]) {
                0 -> count[i][j] = 0
                1 -> count[i][j] = -1
                2 -> {
                    count[i][j] = 0
                    start = i to j
                }
            }
        }
    }

    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addLast(start)

    while (queue.isNotEmpty()) {
        val cur = queue.removeFirst()

        for (d in 0..3) {
            val nx = cur.first + dx[d]
            val ny = cur.second + dy[d]

            if (nx in 0 until n && ny in 0 until m) {
                if (map[nx][ny] == 1 && count[nx][ny] == -1) {
                    count[nx][ny] = count[cur.first][cur.second] + 1
                    queue.addLast(nx to ny)
                }
            }
        }
    }

    for (i in count.indices) {
        for (j in count[i].indices) {
            print("${count[i][j]} ")
        }
        println()
    }

}