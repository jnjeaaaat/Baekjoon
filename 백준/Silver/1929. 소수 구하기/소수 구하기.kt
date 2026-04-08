import kotlin.math.sqrt

fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val isNotPrime = BooleanArray(n + 1)

    isNotPrime[0] = true
    isNotPrime[1] = true

    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (!isNotPrime[i]) {
            var next = i * i
            while (next <= n) {
                isNotPrime[next] = true
                next += i
            }
        }
    }

    val sb = buildString {
        for (i in m..n) {
            if (!isNotPrime[i]) {
                appendLine(i)
            }
        }
    }

    print(sb)
}