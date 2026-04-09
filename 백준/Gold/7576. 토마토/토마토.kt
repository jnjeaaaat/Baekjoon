fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val queue = ArrayDeque<Tomato>()
    val box = Array(n) { i ->
        val row = readln().split(" ").map { it.toInt() }.toIntArray()
        for (j in 0 until m) {
            if (row[j] == 1) {
                queue.add(Tomato(i, j, 0))
            }
        }
        row
    }

    fun bfs(): Int {
        val dx = intArrayOf(0, 0, 1, -1)
        val dy = intArrayOf(1, -1, 0, 0)

        var day = 0
        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            day = cur.day

            for (d in 0..3) {
                val nx = cur.x + dx[d]
                val ny = cur.y + dy[d]

                if (nx in 0 until n && ny in 0 until m) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = box[cur.x][cur.y] + 1
                        queue.add(Tomato(nx, ny, cur.day + 1))
                    }
                }
            }
        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (box[i][j] == 0) {
                    return -1
                }
            }
        }

        return day
    }

    print(bfs())
}

data class Tomato(val x: Int, val y: Int, val day: Int)