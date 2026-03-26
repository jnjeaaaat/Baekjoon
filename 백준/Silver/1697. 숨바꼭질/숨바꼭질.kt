fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val line = IntArray(100_001)

    fun bfs(start: Int): Int {
        val queue = ArrayDeque<Int>()
        line[start] = 0
        queue.addLast(start)

        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()

            if (cur == k) {
                return line[cur]
            }

            if (cur + 1 < line.size && line[cur + 1] == 0) {
                queue.addLast(cur + 1)
                line[cur + 1] = line[cur] + 1
            }

            if (cur - 1 >= 0 && line[cur - 1] == 0) {
                queue.addLast(cur - 1)
                line[cur - 1] = line[cur] + 1
            }

            if (cur * 2 < line.size && line[cur * 2] == 0) {
                queue.addLast(cur * 2)
                line[cur * 2] = line[cur] + 1
            }
        }

        return -1
    }

    print(bfs(n))
}