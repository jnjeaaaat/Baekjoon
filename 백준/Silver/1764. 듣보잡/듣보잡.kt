fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = List(n) { readln() }.toSet()
    val b = List(m) { readln() }.toSet()

    val common = (a intersect b).sorted()

    println(common.size)
    print(common.joinToString("\n"))
}