import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map({ it.toInt() })
    val first = Array(n) { IntArray(m) }
    val second = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        first[i] = readLine().split(" ").map({ it.toInt() }).toIntArray()
    }

    for (i in 0 until n) {
        second[i] = readLine().split(" ").map({ it.toInt() }).toIntArray()
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            print((first[i][j] + second[i][j]).toString() + " ")
        }
        println()
    }
}