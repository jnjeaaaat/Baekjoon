fun main() {
    val (n, m) = readln().split(" ").map(String::toInt)
    val board = Array(n) { readln().toCharArray() }
    val count = Array(n) { IntArray(m) }
    val queue = ArrayDeque<IntArray>()
    queue.addLast(intArrayOf(0, 0))

    val dx = arrayOf(1, -1, 0, 0)
    val dy = arrayOf(0, 0, 1, -1)

    count[0][0] = 1
    while (queue.isNotEmpty()) {
        val cur = queue.removeFirst()

        for (i in 0..3) {
            val nx = cur[0] + dx[i]
            val ny = cur[1] + dy[i]

            if (nx in 0 until n && ny in 0 until m) {
                if (board[nx][ny] == '1' && count[nx][ny] == 0) {
                    queue.add(intArrayOf(nx, ny))
                    count[nx][ny] = count[cur[0]][cur[1]] + 1
                }
            }
        }
    }

    print(count[n - 1][m - 1])

}
