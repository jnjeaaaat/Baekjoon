fun main() {
    val n = readln().toInt()
    val normal = Array(n) { CharArray(n) }
    val weak = Array(n) { CharArray(n) }

    repeat(n) { i ->
        val input = readln()
        repeat(n) { j ->
            normal[i][j] = input[j]
            weak[i][j] = if (input[j] == 'G') 'R' else input[j]
        }
    }

    fun countArea(arr: Array<CharArray>): Int {
        var count = 0
        val visited = Array(n) { BooleanArray(n) }
        val dx = intArrayOf(0, 0, 1, -1)
        val dy = intArrayOf(1, -1, 0, 0)

        fun bfs(i: Int, j: Int) {
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.add(i to j)

            while (queue.isNotEmpty()) {
                val (x, y) = queue.removeFirst()

                for (d in 0..3) {
                    val nx = x + dx[d]
                    val ny = y + dy[d]

                    if (nx in 0 until n && ny in 0 until n) {
                        if (arr[nx][ny] == arr[i][j] && !visited[nx][ny]) {
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
                    visited[i][j]
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