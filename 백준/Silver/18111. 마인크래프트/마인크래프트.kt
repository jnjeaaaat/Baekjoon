fun main() {
    val (n, m, b) = readln().split(" ").map { it.toInt() }

    val count = IntArray(257)

    var min = 256
    var max = 0
    repeat(n) {
        val value = readln().split(" ").map { it.toInt() }.toIntArray()
        for (i in value) {
            count[i]++

            if (i < min) min = i
            if (i > max) max = i
        }
    }

    var bestTime = Int.MAX_VALUE
    var bestHeight = 0

    for (target in min..max) {
        var removeBlock = 0
        var addBlock = 0

        for (h in 0..256) {
            val cnt = count[h]
            if (cnt == 0) continue

            if (target < h) {
                val diff = h - target
                removeBlock += diff * cnt
            } else if (target > h) {
                val diff = target - h
                addBlock += diff * cnt
            }
        }

        if (b + removeBlock < addBlock) {
            continue
        }

        val time = removeBlock * 2 + addBlock

        if (time < bestTime || (time == bestTime && target > bestHeight)) {
            bestTime = time
            bestHeight = target
        }
    }

    print("$bestTime $bestHeight")
}