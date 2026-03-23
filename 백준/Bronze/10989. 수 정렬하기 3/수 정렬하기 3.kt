import java.io.*

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val count = IntArray(10_001)

    repeat(n) {
        val x = readLine().toInt()
        count[x]++
    }

    val sb = StringBuilder()
    for (i in 1 until count.size) {
        var cnt = count[i]
        while (cnt-- > 0) {
            sb.append(i).append('\n')
        }
    }

    print(sb)
}