import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import kotlin.math.abs

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().split(" ").map({ it.toLong() })
    print(abs(a - b))
}