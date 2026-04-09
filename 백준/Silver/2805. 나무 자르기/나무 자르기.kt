fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    var max = 0
    val trees = readln()
        .split(" ")
        .map { it.toInt() }
        .onEach { max = maxOf(max, it) }
        .toIntArray()

    fun canCut(mid: Int): Boolean {
        var sum = 0L

        for (i in trees) {
            if (i > mid) {
                sum += i - mid
            }
        }

        return sum >= m
    }

    var left = 0
    var right = max
    var answer = 0
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