fun main() {
    var (n, k) = readln().split(" ").map(String::toInt)
    val coins = IntArray(n) { readln().toInt() }
    var count = 0
    for (i in n - 1 downTo 0) {
        if (k < coins[i]) {
            continue
        }

        count += k / coins[i]
        k %= coins[i]
    }

    print(count)
}