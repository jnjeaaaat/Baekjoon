fun main() {
    val n = readln().toInt()
    val stairs = IntArray(n + 1)
    val dp = IntArray(n + 1)

    for (i in 1..n) {
        stairs[i] = readln().toInt()
    }

    dp[1] = stairs[1]

    if (n >= 2) {
        dp[2] = stairs[1] + stairs[2]
    }

    for (i in 3..n) {
        dp[i] = maxOf(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i]
    }

    print(dp[n])
}