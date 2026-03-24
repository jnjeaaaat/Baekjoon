import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import kotlin.math.pow

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val M = 1_234_567_891L
    val L = readLine().toInt()
    val str = readLine()

    var sum = 0L
    val r = 31.toDouble()
    repeat(L) { i ->
        val cur = (str[i] - 'a') + 1
        val beforeSum = (cur * (r.pow(i) % M)).toInt()
        sum += beforeSum % M
    }

    print(sum)
}