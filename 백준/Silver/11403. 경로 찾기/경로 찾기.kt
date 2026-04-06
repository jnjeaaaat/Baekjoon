fun main() {
    val n = readln().toInt()
    val graph = Array(n) { readln().split(" ").map(String::toInt).toIntArray() }

    for (k in graph.indices) {
        for (i in graph.indices) {
            if (graph[i][k] == 1) {
                for (j in graph.indices) {
                    if (graph[k][j] == 1) {
                        graph[i][j] = 1
                    }
                }
            }
        }
    }

    val sb = buildString {
        for (i in graph.indices) {
            for (j in graph.indices) {
                append(graph[i][j]).append(' ')
            }
            append('\n')
        }
    }

    print(sb)
}