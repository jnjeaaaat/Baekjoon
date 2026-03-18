import java.io.*
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    print(fac(n) / (fac(a) * fac(b) * fac(c)))
}

fun fac(n: Int): Long {
    var res = 1L
    for (i in 2..n) res *= i
    return res
}