fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()

    repeat(n) {
        val str = readln()
        map.put(str, map.getOrDefault(str, 0) + 1)
    }

    repeat(m) {
        val str = readln()
        map.put(str, map.getOrDefault(str, 0) + 1)
    }

    val list = mutableListOf<String>()
    for (entry in map.entries) {
        if (entry.value > 1) {
            list.add(entry.key)
        }
    }

    list.sort()
    println(list.size)
    val sb = buildString {
        repeat(list.size) { i ->
            appendLine(list.get(i))
        }
    }

    print(sb)
}