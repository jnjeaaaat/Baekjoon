fun main() {
    val n = readln().toInt()
    var count = 0
    var i = 5
    while (i <= n) {
        count += n / i
        i *= 5
    }

    print(count)
}