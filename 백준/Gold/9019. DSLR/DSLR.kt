fun main() {
    val T = readln().toInt()
    val sb = buildString {
        repeat(T) {
            val (a, b) = readln().split(" ").map { it.toInt() }
            val visited = BooleanArray(10_001)

            val queue = ArrayDeque<Pair<Int, String>>()
            queue.addLast(a to "")
            visited[a] = true

            while (queue.isNotEmpty()) {
                val (num, dslr) = queue.removeFirst()

                if (num == b) {
                    appendLine(dslr)
                    break
                }

                // d
                val d = (2 * num) % 10_000
                if (!visited[d]) {
                    visited[d] = true
                    queue.addLast(d to dslr + "D")
                }
                // s
                val s = if (num == 0) 9999 else num - 1
                if (!visited[s]) {
                    visited[s] = true
                    queue.addLast(s to dslr + "S")
                }
                // l
                val l = (num % 1000) * 10 + num / 1000
                if (!visited[l]) {
                    visited[l] = true
                    queue.addLast(l to dslr + "L")
                }
                // r
                var r = (num % 10) * 1000 + num / 10
                if (!visited[r]) {
                    visited[r] = true
                    queue.addLast(r to dslr + "R")
                }
            }
        }
    }

    print(sb)
}