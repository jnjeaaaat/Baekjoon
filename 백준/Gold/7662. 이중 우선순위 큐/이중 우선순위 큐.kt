import java.util.*

fun main() {
    val T = readln().toInt()

    val sb = buildString {
        repeat(T) {
            val map = TreeMap<Int, Int>()

            val n = readln().toInt()

            for (i in 0 until n) {
                val str = readln().split(" ")
                val op = str[0][0]
                val num = str[1].toInt()

                when (op) {
                    'I' -> {
                        map[num] = (map[num] ?: 0) + 1
                    }

                    'D' -> {
                        if (map.isEmpty()) {
                            continue
                        }

                        var cur = 0
                        when (num) {
                            1 -> cur = map.lastKey()
                            -1 -> cur = map.firstKey()
                        }

                        if (map[cur] == 1) {
                            map.minusAssign(cur)
                        } else {
                            map[cur] = (map[cur] ?: 0) - 1
                        }
                    }
                }
            }

            if (map.isEmpty()) {
                appendLine("EMPTY")
            } else {
                append(map.lastKey()).append(' ')
                appendLine(map.firstKey())
            }
        }
    }

    print(sb)
}