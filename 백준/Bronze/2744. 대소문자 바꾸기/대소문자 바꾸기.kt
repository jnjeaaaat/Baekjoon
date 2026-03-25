fun main() {
    val str = readln()
    val sb = buildString(str.length) {
        for (ch in str) {
            if (ch.isLowerCase()) append(ch.uppercaseChar())
            else append(ch.lowercaseChar())
        }
    }

    print(sb)
}