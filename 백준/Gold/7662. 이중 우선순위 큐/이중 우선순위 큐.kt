import java.util.*

fun main() {
    val T = readln().toInt()

    fun remove(queue: PriorityQueue<Int>, map: MutableMap<Int, Int>): Int {
        var cur = 0

        while (true) {
            cur = queue.poll()

            val cnt = map[cur] ?: 0
            if (cnt == 0) continue

            if (cnt == 1) map.remove(cur)
            else map[cur] = cnt - 1

            break
        }

        return cur
    }

    val sb = buildString {
        repeat(T) {
            val minQueue = PriorityQueue<Int>()
            val maxQueue = PriorityQueue<Int>(reverseOrder())
            val map = mutableMapOf<Int, Int>()

            val n = readln().toInt()

            for (i in 0 until n) {
                val str = readln().split(" ")
                val op = str[0][0]
                val num = str[1].toInt()

                when (op) {
                    'I' -> {
                        map[num] = (map[num] ?: 0) + 1
                        minQueue.add(num)
                        maxQueue.add(num)
                    }

                    'D' -> {
                        if (map.isEmpty()) {
                            continue
                        }

                        when (num) {
                            1 -> remove(maxQueue, map)
                            -1 -> remove(minQueue, map)
                        }
                    }
                }
            }

            if (map.isEmpty()) {
                appendLine("EMPTY")
            } else {
                val res = remove(maxQueue, map)
                append(res).append(' ')
                appendLine(if (map.isNotEmpty()) remove(minQueue, map) else res)
            }
        }
    }

    print(sb)
}