fun main() {
    val (k, n) = readln().split(" ").map(String::toInt)
    var max = 0L
    val lanArr = LongArray(k) {
        val num = readln().toLong()
        max = maxOf(num, max)
        num
    }

    fun isCanCut(cur: Long): Boolean {
        var sum = 0L
        for (lan in lanArr) {
            if (lan >= cur) {
                sum += lan / cur
            }
        }

        if (sum >= n) {
            return true
        }

        return false
    }

    var left = 1L
    var right = max
    var answer = 0L
    while (left <= right) {
        val mid = (left + right) / 2
        if (isCanCut(mid)) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    print(answer)
}