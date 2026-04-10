fun main() {
    val ex = readln()

    fun sumOf(nums: String): Int {
        var sum = 0
        var total = 0

        for (num in nums) {
            if (num != '+') {
                sum = (sum * 10) + (num - '0')
            } else {
                total += sum
                sum = 0
            }
        }

        return total + sum
    }

    var answer = 0
    var end = ex.length
    var sb = StringBuilder()
    var flag = false
    for (i in 0..end - 1) {
        if (ex[i] != '-') {
            sb.append(ex[i])
        } else {
            if (!flag) {
                answer += sumOf(sb.toString())
                flag = true
            } else {
                answer -= sumOf(sb.toString())
            }
            sb = StringBuilder()
        }
    }

    if (!flag) {
        answer += sumOf(sb.toString())
    } else {
        answer -= sumOf(sb.toString())
    }

    print(answer)
}