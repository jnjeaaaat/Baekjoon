fun main() {
    val n = readln().toInt()
    val Tshirt = readln().split(" ").map { it.toInt() }.toIntArray()
    val (t, p) = readln().split(" ").map { it.toInt() }

    var sum = 0
    for (per in Tshirt) {
        if (per % t == 0) {
            sum += per / t
        } else {
            sum += per / t + 1
        }
    }

    println(sum)
    print("${n / p} ${n % p}")
}