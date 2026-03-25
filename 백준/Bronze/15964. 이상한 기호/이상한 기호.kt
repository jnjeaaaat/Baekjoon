fun main() {
    val (a, b) = readln().split(" ").map( {it.toLong()} )
    print((a + b) * (a - b))
}