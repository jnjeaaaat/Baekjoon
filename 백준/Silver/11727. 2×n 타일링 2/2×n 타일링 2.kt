const val MOD = 10_007

fun main() {
    val n = readln().toInt()
    val dp = IntArray(1001)

    dp[1] = 1
    dp[2] = 3

    for (i in 3..1000) {
        dp[i] = (dp[i - 1] + dp[i - 2] * 2) % MOD
    }

    print(dp[n])
}