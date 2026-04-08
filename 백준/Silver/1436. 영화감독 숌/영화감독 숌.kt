fun main() {
    val n = readln().toInt()

    var count = 1
    var base = 666
    while (count < n) {
        base++
        if (base.toString().contains("666")) {
            count++
        }
    }

    print(base)
}