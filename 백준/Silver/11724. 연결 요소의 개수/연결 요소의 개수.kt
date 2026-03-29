fun main() {
    val (n, m) = readln().split(" ").map(String::toInt)
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1)
    repeat(m) {
        val (a, b) = readln().split(" ").map(String::toInt)

        graph[a].add(b)
        graph[b].add(a)
    }

    var count = 0
    for (i in 1..n) {

        if (!visited[i]) {
            val queue = ArrayDeque<Int>()
            queue.addLast(i)
            visited[i] = true
            count++

            while (queue.isNotEmpty()) {
                val cur = queue.removeFirst()

                for (next in graph[cur]) {
                    if (!visited[next]) {
                        visited[next] = true
                        queue.addLast(next)
                    }
                }
            }
        }
    }

    print(count)
}