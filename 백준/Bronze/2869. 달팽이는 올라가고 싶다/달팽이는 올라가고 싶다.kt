fun main() {
    val (up, down, v) = readln().split(" ").map { it.toInt() }

    var day = (v - down) / (up - down)
    if ((v - down) % (up - down) != 0) {
        day++
    }

    print(day)
}