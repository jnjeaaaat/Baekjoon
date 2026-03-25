fun main() {
    val sb = buildString {
        while (true) {
            val line = readLine() ?: break
            appendLine(line)
        }
    }

    print(sb)
}