fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, String>()

    repeat(n) {
        val (site, pwd) = readln().split(" ")
        map[site] = pwd
    }

    val sb = buildString {
        repeat(m) {
            val site = readln()
            appendLine(map[site])
        }
    }

    print(sb)
}