fun main() {
    val parts = readln().split("-")

    fun sumOf(part: String): Int {
        return part.split("+").sumOf() { it.toInt() }
    }

    var answer = sumOf(parts[0])
    for (i in 1 until parts.size) {
        answer -= sumOf(parts[i])
    }

    print(answer)
}