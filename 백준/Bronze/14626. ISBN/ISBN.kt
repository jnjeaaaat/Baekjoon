import java.io.*;

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    val starIdx = str.indexOf('*')

    var sum = 0
    for (i in 0 until str.length - 1) {
        if (i == starIdx) {
            continue
        }

        val cur = str[i] - '0'
        val con = if (i % 2 == 0) 1 else 3
        sum += cur * con
    }

    val target = (10 - (str[str.length - 1] - '0')) % 10

    var ans = 0
    val con = if (starIdx % 2 == 0) 1 else 3
    for (i in 0..9) {

        if ((sum + i * con) % 10 == target) {
            ans = i
            break
        }
    }

    print(ans)
}