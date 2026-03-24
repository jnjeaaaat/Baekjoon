import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val M = 1_234_567_891L
    val L = readLine().toInt()
    val str = readLine()

    var sum = 0L
    var r = 1L // 31^0
    for (i in 0 until L) {
        val cur = str[i] - 'a' + 1
        sum += (cur * r % M) % M

        r = (r * 31L) % M
    }

    print(sum)
}