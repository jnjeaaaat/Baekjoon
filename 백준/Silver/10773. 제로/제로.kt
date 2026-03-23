import java.io.*

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val k = readLine().toInt()
    val stack = ArrayDeque<Int>()

    var sum = 0
    repeat(k) {
        val n = readLine().toInt()

        if (n == 0) {
            sum -= stack.removeLast()
        } else {
            sum += n
            stack.addLast(n)
        }
    }

    print(sum)
}