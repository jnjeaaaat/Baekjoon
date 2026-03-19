import java.io.*
import java.util.*

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt();
    val st = StringTokenizer(readLine())
    val S = IntArray(n) {
        st.nextToken().toInt()
    }
    val fruits = IntArray(10)

    var left = 0
    var right = 0
    var kindCount = 0
    var max = 0
    while (right < n) {
        val fruit = S[right]
        if (fruits[fruit] == 0) {
            kindCount++
        }
        fruits[fruit]++

        while (kindCount > 2) {
            val leftFruit = S[left]
            fruits[leftFruit]--
            if (fruits[leftFruit] == 0) {
                kindCount--
            }
            left++
        }

        max = maxOf(max, right - left + 1)
        right++
    }

    print(max)
}