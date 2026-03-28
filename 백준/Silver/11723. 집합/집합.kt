import java.util.*

fun main() {
    val m = readln().toInt()
    val sb = StringBuilder()

    var bit = 0
    repeat(m) {
        val st = StringTokenizer(readln())
        val op = st.nextToken()

        when (op) {
            "all" -> bit = (1 shl 20) - 1
            "empty" -> bit = 0
            else -> {
                val x = st.nextToken().toInt()
                val mask = (1 shl (x - 1))

                when (op) {
                    "add" -> bit = bit or mask
                    "remove" -> bit = bit and mask.inv()
                    "toggle" -> bit = bit xor mask
                    else -> sb.appendLine(
                        if (bit and mask != 0) 1 else 0
                    )
                }
            }
        }
    }

    print(sb)
}