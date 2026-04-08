fun main() {
    val n = readln().toInt()

    var end = 1
    var step = 1
    while (end < n) {
        end += (step * 6)
        step++
    }

    print(step)
}