import java.util.StringTokenizer

fun main() {
    val n = readln().toInt()
    val paper = Array(n) { IntArray(n) }
    var white = 0
    var blue = 0

    for (i in paper.indices) {
        val st = StringTokenizer(readln())
        for (j in paper[i].indices) {
            paper[i][j] = st.nextToken().toInt()
        }
    }

    fun cut(row: Int, col: Int, size: Int) {

        fun isSameColor(row: Int, col: Int, size: Int): Boolean {
            val curColor = paper[row][col]

            for (i in row until row + size) {
                for (j in col until col + size) {
                    if (paper[i][j] != curColor) {
                        return false
                    }
                }
            }

            return true
        }

        if (isSameColor(row, col, size)) {
            if (paper[row][col] == 0) {
                white++
            } else {
                blue++
            }
            return
        }

        val half = size / 2

        cut(row, col, half)
        cut(row + half, col, half)
        cut(row, col + half, half)
        cut(row + half, col + half, half)
    }

    cut(0, 0, n)

    println(white)
    println(blue)
}