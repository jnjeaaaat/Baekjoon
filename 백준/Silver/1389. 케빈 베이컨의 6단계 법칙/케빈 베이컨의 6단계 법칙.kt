fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val relation = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        relation[a].add(b)
        relation[b].add(a)
    }

    var min = Int.MAX_VALUE
    var ans = 0
    for (i in 1..n) {
        val count = IntArray(n + 1) { -1 }
        val queue = ArrayDeque<Int>()

        count[i] = 0
        queue.add(i)

        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()

            for (next in relation[cur]) {
                if (count[next] == -1) {
                    count[next] = count[cur] + 1
                    queue.add(next)
                }
            }
        }

        var sum = 0
        for (j in 1..n) {
            sum += count[j]
        }

        if (sum < min) {
            min = sum
            ans = i
        }
    }

    print(ans)
}