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

data class Meeting(val start: Int, val end: Int) : Comparable<Meeting> {
    override fun compareTo(other: Meeting): Int {
        val result = end.compareTo(other.end)
        return if (result == 0) start.compareTo(other.start) else result
    }
}