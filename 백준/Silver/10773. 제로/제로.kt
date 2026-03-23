import java.io.*;
import java.util.Stack

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val k = readLine().toInt()
    val stack = Stack<Int>()

    var sum = 0
    repeat(k) {
        val n = readLine().toInt()

        if (n == 0) {
            sum -= stack.pop()
        } else {
            sum += n
            stack.push(n)
        }
    }

    print(sum)
}