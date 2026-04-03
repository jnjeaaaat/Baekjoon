fun main() {
    val N = readln().toInt()

    fun bfs(start: Int, target: Int): String {
        val visited = BooleanArray(10_000)
        val queue = ArrayDeque<Node>()

        queue.addLast(Node(start, ""))
        visited[start] = true

        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            val n = cur.value

            if (n == target) {
                return cur.cmd
            }

            // D
            val d = (n * 2) % 10_000
            if (!visited[d]) {
                visited[d] = true
                queue.addLast(Node(d, cur.cmd + "D"))
            }

            // S
            val s = if (n == 0) 9999 else n - 1
            if (!visited[s]) {
                visited[s] = true
                queue.addLast(Node(s, cur.cmd + "S"))
            }

            // L
            val l = n % 1000 * 10 + n / 1000
            if (!visited[l]) {
                visited[l] = true
                queue.addLast(Node(l, cur.cmd + "L"))
            }

            // R
            val r = n % 10 * 1000 + n / 10
            if (!visited[r]) {
                visited[r] = true
                queue.addLast(Node(r, cur.cmd + "R"))
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

data class Node(val value: Int, val cmd: String)