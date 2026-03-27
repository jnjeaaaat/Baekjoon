fun main() {
    val n = readln().toInt()
    val meetings = Array(n) {
        val (start, end) = readln().split(" ").map(String::toInt)
        Meeting(start, end)
    }.sortedWith(
        compareBy<Meeting> { it.end }
            .thenBy { it.start }
    )

    var end = 0
    var count = 0

    for ((start, finish) in meetings) {
        if (start >= end) {
            count++
            end = finish
        }
    }

    print(count)
}

data class Meeting(val start: Int, val end: Int)