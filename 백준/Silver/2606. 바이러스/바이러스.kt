fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val isVirus = BooleanArray(n + 1)
    isVirus[1] = true

    repeat(m) {
        val (a, b) = readln().split(" ").map({ it.toInt() })

        graph[a].add(b)
        graph[b].add(a)
    }

    fun dfs(cur: Int) {
        isVirus[cur] = true
        for (next in graph[cur]) {
            if (!isVirus[next]) {
                dfs(next)
            }
        }
    }

    dfs(1)

    val count = (2..n).count { isVirus[it] }
    print(count)
}