fun main() {
    val n = readln().toInt()
    val step = IntArray(n) {
        readln().toInt()
    }

    val dp = IntArray(n + 1)
    dp[0] = 0
    if (n > 0) dp[1] = step[0]
    if (n > 1) dp[2] = step[0] + step[1]

    if (n > 2) {
        dp[3] = maxOf(step[0], step[1]) + step[2]
    }

    for (i in 4..n) {
        dp[i] = maxOf(dp[i - 2], dp[i - 3] + step[i - 2]) + step[i - 1]
    }

    print(dp[n])
}