import java.util.*

fun main() {
    var st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val trees = LongArray(n)
    var max = 0L
    st = StringTokenizer(readln())
    for (i in trees.indices) {
        trees[i] = st.nextToken().toLong()
        max = maxOf(trees[i], max)
    }

    fun canCut(mid: Long): Boolean {
        var sum = 0L
        for (trees in trees) {
            if (trees > mid) {
                sum += (trees - mid)
            }

            if (sum >= m) {
                return true
            }
        }

        return false
    }

    var left = 0L
    var right = max
    var answer = 0L
    while (left <= right) {
        val mid = (left + right) / 2
        if (canCut(mid)) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    print(answer)
}