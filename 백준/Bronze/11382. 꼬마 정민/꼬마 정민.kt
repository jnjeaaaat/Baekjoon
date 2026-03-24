import java.io.*
import java.util.StringTokenizer

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    print(st.nextToken().toLong() + st.nextToken().toLong() + st.nextToken().toLong())
}