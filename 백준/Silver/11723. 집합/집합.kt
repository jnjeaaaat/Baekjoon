fun main() {
    val n = readln().toInt()

    var bit = 0
    val sb = buildString {
        repeat(n) {
            val input = readln()

            when (input) {
                "all" -> bit = 0.inv()
                "empty" -> bit = 0
                else -> {
                    val op = input.split(" ")[0]
                    val x = input.split(" ")[1].toInt()
                    val num = 1.shl(x - 1)
                    when (op) {
                        "add" -> bit = bit or num
                        "remove" -> bit = bit and num.inv()
                        "toggle" -> bit = bit xor num
                        else -> appendLine(if (bit and num != 0) 1 else 0)
                    }
                }
            }
        }
    }

    print(sb)
}