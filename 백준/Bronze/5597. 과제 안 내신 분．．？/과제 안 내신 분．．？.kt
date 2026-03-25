import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val count = IntArray(31)
    repeat(28) {
        count[readLine().toInt()]++
    }

    var cnt = 0
    for (i in 1..30) {
        if (count[i] == 0) {
            println(i)
            cnt++
        }

        if (cnt == 2) {
            break;
        }
    }
}