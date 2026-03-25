fun main() {
    val T = readln().toInt()

    val sb = buildString {
        repeat(T) {
            val str = readln()
            append(str.first())
            appendLine(str.last())
        }
    }

    print(sb)
}