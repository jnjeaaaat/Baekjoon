fun main() {
    val (n, m) = readln().split(" ").map(String::toInt)
    val freq = mutableMapOf<String, Int>()

    repeat(n + m) {
        val s = readln()
        freq[s] = (freq[s] ?: 0) + 1
    }

    val result = freq
        .filterValues { it > 1 }
        .keys
        .sorted()

    println(result.size)
    print(result.joinToString("\n"))
}
