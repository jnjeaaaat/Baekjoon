fun main() {
    val N = readln().toInt()

    fun bfs(start: Int, target: Int): String {
        val visited = BooleanArray(10_000)
        val queue = ArrayDeque<Pair<Int, String>>()

        queue.addLast(start to "")
        visited[start] = true

        while (queue.isNotEmpty()) {
            val (n, cmd) = queue.removeFirst()

            if (n == target) {
                return cmd
            }

            // D
            val d = (n * 2) % 10_000
            if (!visited[d]) {
                visited[d] = true
                queue.addLast(d to cmd + "D")
            }

            // S
            val s = if (n == 0) 9999 else n - 1
            if (!visited[s]) {
                visited[s] = true
                queue.addLast(s to cmd + "S")
            }

            // L
            val l = n % 1000 * 10 + n / 1000
            if (!visited[l]) {
                visited[l] = true
                queue.addLast(l to cmd + "L")
            }

            // R
            val r = n % 10 * 1000 + n / 10
            if (!visited[r]) {
                visited[r] = true
                queue.addLast(r to cmd + "R")
            }

        }

        return ""
    }

    val sb = buildString {
        repeat(N) {
            val (a, b) = readln().split(" ").map { it.toInt() }

            appendLine(bfs(a, b))
        }
    }

    print(sb)
}
