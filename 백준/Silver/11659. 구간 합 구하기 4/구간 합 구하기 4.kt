import java.util.*

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val nums = IntArray(n + 1)

    val st = StringTokenizer(readln())
    for (i in 1..n) {
        nums[i] = nums[i - 1] + st.nextToken().toInt()
    }

    val sb = buildString {
        repeat(m) {
            val (a, b) = readln().split(" ").map { it.toInt() }
            appendLine(nums[b] - nums[a - 1])
        }
    }

    print(sb)
}