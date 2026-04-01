fun main() {
    val T = readln().toInt()

    val sb = buildString {

        repeat(T) {
            val method = readln()
            val n = readln().toInt()
            val str = readln()
            val queue = ArrayDeque<Int>()

            if (n > 0) {
                val inner = str.substring(1, str.length - 1)
                val tokens = inner.split(',')
                for (token in tokens) {
                    queue.addLast(token.toInt())
                }
            }

            var reverse = false
            var error = false

            for (ch in method) {
                when (ch) {
                    'R' -> reverse = !reverse
                    'D' -> {
                        if (queue.isEmpty()) {
                            error = true
                            break
                        } else {
                            if (!reverse) {
                                queue.removeFirst()
                            } else {
                                queue.removeLast()
                            }
                        }
                    }
                }
            }

            if (error) {
                appendLine("error")
            } else {
                append('[')
                if (queue.isNotEmpty()) {
                    if (!reverse) {
                        append(queue.removeFirst())
                        while (queue.isNotEmpty()) {
                            append(',').append(queue.removeFirst())
                        }

                    } else {
                        append(queue.removeLast())
                        while (queue.isNotEmpty()) {
                            append(',').append(queue.removeLast())
                        }
                    }
                }

                appendLine(']')
            }
        }
    }

    print(sb)
}