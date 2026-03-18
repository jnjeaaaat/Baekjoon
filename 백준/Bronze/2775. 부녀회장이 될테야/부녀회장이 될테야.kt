import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    val T = readLine().toInt()

    repeat(T) {
        val k = readLine().toInt()
        val n = readLine().toInt()

        val dp = Array(k + 1) { IntArray(n + 1) }
        for (i in 1..n) {
            dp[0][i] = i
        }

        for (i in 1..k) {
            for (j in 1..n) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
            }
        }

        sb.append(dp[k][n]).append('\n')
    }

    print(sb)
}