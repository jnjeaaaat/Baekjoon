import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = br.readLine().toInt()

    val list = ArrayList<Member>()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val age = st.nextToken().toInt()
        val name = st.nextToken()

        list.add(Member(age, name))
    }

    val sortedList = list.sortedBy { it.age }
    for (m in sortedList) {
        sb.append(m.age).append(' ').append(m.name).append('\n')
    }

    print(sb)
}

data class Member(
    val age: Int,
    val name: String
)