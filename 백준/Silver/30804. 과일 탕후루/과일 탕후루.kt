fun main() {
    val n = readln().toInt()
    val tang = readln().split(" ").map(String::toInt)
    val map = mutableMapOf<Int, Int>()

    var left = 0
    var right = 0
    var max = 0
    while (right < n) {
        val rFruit = tang[right]
        map[rFruit] = (map[rFruit] ?: 0) + 1

        while (map.size > 2) {
            val lFruit = tang[left]
            map[lFruit] = map[lFruit]!! - 1
            if (map[lFruit] == 0) {
                map.remove(lFruit)
            }

            left++
        }

        max = maxOf(max, right - left + 1)
        right++
    }

    print(max)
}