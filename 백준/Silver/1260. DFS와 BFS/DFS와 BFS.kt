fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    var visited = BooleanArray(n + 1)
    val sb = StringBuilder()
    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    for (list in graph) {
        list.sort()
    }

    fun dfs(cur: Int) {
        sb.append(cur).append(' ')
        visited[cur] = true

        for (next in graph[cur]) {
            if (!visited[next]) {
                dfs(next)
            }
        }
    }

    dfs(v)
    sb.appendLine()

    visited = BooleanArray(n + 1)
    fun bfs(start: Int) {
        val queue = ArrayDeque<Int>()
        queue.add(start)

        visited[start] = true

        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            sb.append(cur).append(' ')

            for (next in graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true
                    queue.addLast(next)
                }
            }
        }
    }

    bfs(v)

    print(sb)
}