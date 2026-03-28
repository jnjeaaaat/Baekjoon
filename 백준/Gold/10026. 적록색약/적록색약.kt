fun main() {
    val n = readln().toInt()
    val normal = Array(n) { CharArray(n) }
    val weak = Array(n) { CharArray(n) }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    repeat(n) { i ->
        normal[i] = readln().toCharArray()
    }

    for (i in weak.indices) {
        for (j in weak[i].indices) {
            val origin = normal[i][j]
            weak[i][j] = if (origin == 'G') 'R' else origin
        }
    }

    fun countArea(board: Array<CharArray>): Int {
        val visited = Array(n) { BooleanArray(n) }
        var count = 0

        fun bfs(x: Int, y: Int) {
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.add(x to y)
            visited[x][y] = true

            while (queue.isNotEmpty()) {
                val p = queue.removeFirst()

                for (d in 0 until 4) {
                    val nx = p.first + dx[d]
                    val ny = p.second + dy[d]

                    if (nx in 0 until n && ny in 0 until n) {
                        if (board[nx][ny] == board[x][y]
                            && !visited[nx][ny]
                        ) {
                            visited[nx][ny] = true
                            queue.add(nx to ny)
                        }
                    }
                }
            }
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (!visited[i][j]) {
                    count++
                    bfs(i, j)
                }
            }
        }

        return count
    }

    val normalCnt = countArea(normal)
    val weakCnt = countArea(weak)

    print("$normalCnt $weakCnt")
}