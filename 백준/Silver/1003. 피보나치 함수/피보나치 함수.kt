fun main() {
    val T = readln().toInt()
    val dp = Array(41) { IntArray(2) }
    dp[0][0] = 1
    dp[0][1] = 0
    dp[1][0] = 0
    dp[1][1] = 1

    for (i in 2..40) {
        dp[i][0] = dp[i - 1][0] + dp[i - 2][0]
        dp[i][1] = dp[i - 1][1] + dp[i - 2][1]
    }

    val sb = buildString {
        repeat(T) {
            val n = readln().toInt()

            append(dp[n][0]).append(' ')
            appendLine(dp[n][1])
        }
    }
    
    print(sb)
}