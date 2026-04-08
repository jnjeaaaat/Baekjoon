fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val queue = ArrayDeque<Pair<Int, Int>>()
    val map = Array(n) { CharArray(m) }
    val visited = Array(n) { BooleanArray(m) }
    var count = 0

    for (i in 0 until n) {
        val row = readln()
        for (j in 0 until m) {
            if (row[j] == 'I') {
                queue.add(i to j)
                visited[i][j] = true
            }
        }

        map[i] = row.toCharArray()
    }

    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    while (queue.isNotEmpty()) {
        val cur = queue.removeFirst()

        val x = cur.first
        val y = cur.second

        if (map[x][y] == 'P') {
            count++
        }

        for (d in 0..3) {
            val nx = x + dx[d]
            val ny = y + dy[d]

            if (nx in 0 until n && ny in 0 until m) {
                if (map[nx][ny] != 'X' && !visited[nx][ny]) {
                    visited[nx][ny] = true
                    queue.add(nx to ny)
                }
            }
        }
    }

    print(if (count == 0) "TT" else count)
}