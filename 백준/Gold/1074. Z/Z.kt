import kotlin.math.pow

fun main() {
    val (N, r, c) = readln().split(" ").map { it.toInt() }
    var count = 0

    fun find(r: Int, c: Int, size: Int) {
        if (size == 1) {
            return
        }

        val half = size / 2

        if (r < half && c < half) {
            find(r, c, half)
        } else if (r < half && c >= half) {
            count += (size * size) / 4 * 1
            find(r, c - half, half)
        } else if (r >= half && c < half) {
            count += (size * size) / 4 * 2
            find(r - half, c, half)
        } else if (r >= half && c >= half) {
            count += (size * size) / 4 * 3
            find(r - half, c - half, half)
        }

    }

    find(r, c, 2.0.pow(N.toDouble()).toInt())

    print(count)
}