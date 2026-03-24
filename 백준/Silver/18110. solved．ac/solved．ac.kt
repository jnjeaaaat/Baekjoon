import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import kotlin.math.floor

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    if (n == 0) {
        print(0)
        return@with
    }

    fun roundCustom(num: Double): Int =
        floor(num + 0.5).toInt()

    val nums = IntArray(n) {
        readLine().toInt()
    }

    nums.sort()

    val cutPoint = roundCustom(n * 0.15)
    var sum = 0
    for (i in cutPoint until n - cutPoint) {
        sum += nums[i]
    }

    val average = sum.toDouble() / (n - cutPoint * 2)
    print(roundCustom(average))
}