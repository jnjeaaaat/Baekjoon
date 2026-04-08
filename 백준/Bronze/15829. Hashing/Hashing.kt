const val MOD = 1_234_567_891

fun main() {
    val n = readln().toInt()
    val str = readln()
    var r = 1

    var sum = 0
    for (i in 0 until n) {
        val num = str[i] - 'a' + 1
        sum = (sum + (num * r) % MOD) % MOD
        r = (r * 31) % MOD
    }

    print(sum)
}