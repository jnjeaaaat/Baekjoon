import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val T = readLine().toInt()

    val sb = buildString {
        repeat(T) {
            val n = readLine().toInt()
            val minQue = PriorityQueue<Int>()
            val maxQue = PriorityQueue<Int>(reverseOrder())
            val map = mutableMapOf<Int, Int>()

            fun delete(queue: PriorityQueue<Int>, map: MutableMap<Int, Int>): Int {
                var target = 0

                while (queue.isNotEmpty()) {
                    target = queue.poll()

                    if (!map.contains(target)) continue

                    if (map[target]!! - 1 == 0) {
                        map.remove(target)
                    } else {
                        map[target] = map[target]!! - 1
                    }
                    break
                }

                return target
            }

            repeat(n) {
                val (cmd, value) = readLine().split(" ")
                val num = value.toInt()
                when (cmd) {
                    "I" -> {
                        minQue.add(num)
                        maxQue.add(num)

                        map[num] = (map[num] ?: 0) + 1
                    }

                    "D" -> {
                        if (!map.isEmpty()) {
                            when (num) {
                                1 -> delete(maxQue, map)
                                -1 -> delete(minQue, map)
                            }
                        }
                    }
                }
            }

            if (map.isEmpty()) {
                appendLine("EMPTY")
            } else {
                val res = delete(maxQue, map)

                append(res).append(' ')
                    .appendLine(
                        if (map.isNotEmpty())
                            delete(minQue, map)
                        else
                            res
                    )
            }
        }
    }

    print(sb)
}