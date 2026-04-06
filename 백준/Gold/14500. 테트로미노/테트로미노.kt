fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }
    val visited = Array(n) { BooleanArray(m) }
    var max = 0

    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    fun isRange(nx: Int, ny: Int): Boolean {
        return nx in 0 until n && ny in 0 until m
    }

    fun dfs(x: Int, y: Int, sum: Int, depth: Int) {
        if (depth == 4) {
            max = maxOf(max, sum)
            return
        }

        for (d in 0..3) {
            val nx = x + dx[d]
            val ny = y + dy[d]

            if (!isRange(nx, ny)) continue
            if (visited[nx][ny]) continue

            visited[nx][ny] = true
            dfs(nx, ny, sum + board[nx][ny], depth + 1)
            visited[nx][ny] = false
        }
    }

    fun checkT(x: Int, y: Int) {
        val wings = IntArray(4)
        var wingCnt = 0

        for (d in 0..3) {
            val nx = x + dx[d]
            val ny = y + dy[d]

            if (isRange(nx, ny)) {
                wings[d] = board[nx][ny]
                wingCnt++
            }
        }

        if (wingCnt < 3) {
            return
        }

        var sumWing = board[x][y]
        for (i in 0..3) {
            sumWing += wings[i]
        }

        for (i in 0..3) {
            max = maxOf(max, sumWing - wings[i])
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            visited[i][j] = true
            dfs(i, j, board[i][j], 1)
            visited[i][j] = false

            checkT(i, j)
        }
    }

    print(max)
}
