import java.util.*
import kotlin.math.abs

fun main() {
    val n = readln().toInt()
    val queue = PriorityQueue<Int> { a, b ->
        val result = abs(a) - abs(b)
        if (result == 0) a - b else result
    }

    val sb = buildString {
        repeat(n) {
            val x = readln().toInt()

            when (x) {
                0 -> {
                    if (queue.isNotEmpty()) {
                        appendLine(queue.poll())
                    } else {
                        appendLine(0)
                    }
                }

                else -> queue.add(x)
            }
        }
    }

    print(sb)
}