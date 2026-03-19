import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b, v) = readLine().split(" ").map { s -> s.toInt() }
    print(((v - a) + (a - b) - 1) / (a - b) + 1)
}