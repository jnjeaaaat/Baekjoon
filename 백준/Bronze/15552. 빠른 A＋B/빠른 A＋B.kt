import java.io.*
import java.util.StringTokenizer

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val sb = StringBuilder()
    repeat(n) {
        val st = StringTokenizer(readLine())
        sb.append(st.nextToken().toInt() + st.nextToken().toInt()).append('\n')
    }
    print(sb)
}