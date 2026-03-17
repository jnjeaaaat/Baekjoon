import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val op = st.nextToken()
        val x: Int

        when (op) {
            "push" -> {
                x = st.nextToken().toInt()
                stack.push(x)
            }

            "pop" -> {
                if (!stack.empty()) {
                    sb.append(stack.pop()).append('\n')
                } else {
                    sb.append(-1).append('\n')
                }
            }

            "size" -> {
                sb.append(stack.size).append('\n')
            }

            "empty" -> {
                if (!stack.empty()) {
                    sb.append(0).append('\n')
                } else {
                    sb.append(1).append('\n')
                }
            }

            "top" -> {
                if (!stack.empty()) {
                    sb.append(stack.peek()).append('\n')
                } else {
                    sb.append(-1).append('\n')
                }
            }
        }
    }

    print(sb)
}
