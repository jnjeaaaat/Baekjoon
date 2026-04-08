const val MOD = 1_234_567_891

fun main() {
    val n = readln().toInt()
    val str = readln()
    var r = 1L

    var sum = 0L
    for (i in 0 until n) {
        val num = str[i] - 'a' + 1
        sum += (num * r) % MOD
        r = (r * 31) % MOD
    }

    print(sum)
}