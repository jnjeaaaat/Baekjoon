import java.util.PriorityQueue

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    val queue = PriorityQueue<Int>()
    repeat(n) {
        val op = readln().toInt()

        if (op == 0) {
            sb.appendLine(queue.pollOrZero())
        } else {
            queue.add(op)
        }
    }

    print(sb)
}

fun PriorityQueue<Int>.pollOrZero(): Int {
    return if (isNotEmpty()) poll() else 0
}