import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

@Throws(IOException::class)
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val inputs = List(3) { readLine() }

    var ans = 0
    for ((i, cur) in inputs.withIndex()) {
        if (cur != "Fizz" && cur != "Buzz" && cur != "FizzBuzz") {
            ans = cur.toInt() + (3 - i)
            break
        }
    }

    val output = when {
        ans % 15 == 0 -> "FizzBuzz"
        ans % 5 == 0 -> "Buzz"
        ans % 3 == 0 -> "Fizz"
        else -> ans
    }

    print(output)
}