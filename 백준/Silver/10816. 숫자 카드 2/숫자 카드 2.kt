import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val map = HashMap<Int, Int>()

    val st1 = StringTokenizer(br.readLine())
    repeat(n) {
        val num = st1.nextToken().toInt()
        map[num] = (map[num] ?: 0) + 1
    }

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    repeat(m) {
        val num = st2.nextToken().toInt()
        sb.append(map[num] ?: 0).append(' ')
    }

    print(sb)
}
