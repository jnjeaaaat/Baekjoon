fun main() {
    val (ladder, snake) = readln().split(" ").map { it.toInt() }
    val move = IntArray(101) { it }

    repeat(ladder) {
        val (from, to) = readln().split(" ").map { it.toInt() }
        move[from] = to
    }

    repeat(snake) {
        val (from, to) = readln().split(" ").map { it.toInt() }
        move[from] = to
    }

    val count = IntArray(101) { -1 }
    count[1] = 0

    val queue = ArrayDeque<Int>()
    queue.add(1)

    while (queue.isNotEmpty()) {
        val now = queue.removeFirst()
        if (now == 100) {
            break
        }

        for (dice in 1..6) {
            val next = now + dice

            if (next > 100) continue

            val n = move[next]

            if (count[n] == -1) {
                count[n] = count[now] + 1
                queue.add(n)
            }
        }
    }

    print(count[100])
}