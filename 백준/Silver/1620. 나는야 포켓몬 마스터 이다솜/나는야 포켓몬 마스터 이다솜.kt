fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val pokeDex = arrayOfNulls<String>(n)
    val map = mutableMapOf<String, Int>()

    for (i in pokeDex.indices) {
        val poke = readln()
        pokeDex[i] = poke
        map[poke] = i + 1
    }

    val sb = buildString {
        repeat(m) {
            val input = readln()
            if (input.toIntOrNull() != null) {
                appendLine(pokeDex[input.toInt() - 1])
            } else {
                appendLine(map[input])
            }
        }
    }

    print(sb)
}