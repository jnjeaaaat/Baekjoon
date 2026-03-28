fun main() {
    val n = readln().toInt()
    val st = readln()
    val arr = st
        .split(" ")
        .map(String::toInt)
        .toIntArray()

    arr.sort()

    var total = 0
    var sum = 0
    for (i in arr) {
        sum += i
        total += sum
    }

    print(total)
}