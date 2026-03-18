import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val deque: ArrayDeque<Int> = ArrayDeque()
    for (i in 1..n) {
        deque.addLast(i)
    }

    val sb = StringBuilder("<")
    while (deque.isNotEmpty()) {
        repeat(k - 1) {
            deque.addLast(deque.removeFirst())
        }

        sb.append(deque.removeFirst())
        if (deque.isNotEmpty()) {
            sb.append(", ")
        }
    }
    sb.append(">")

    print(sb)
}