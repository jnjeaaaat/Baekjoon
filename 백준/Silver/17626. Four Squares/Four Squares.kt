fun main() {
    val n = readln().toInt()
    val dp = IntArray(n + 1) { Int.MAX_VALUE }
    dp[0] = 0

    for (i in 1..n) {
        var j = 1
        while (j * j <= i) {
            val square = j * j
            dp[i] = minOf(dp[i], dp[i - square] + 1)
            j++
        }
    }

    print(dp[n])
}