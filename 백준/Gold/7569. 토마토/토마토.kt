import java.util.StringTokenizer
import kotlin.collections.ArrayDeque
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.component3
import kotlin.collections.isNotEmpty
import kotlin.collections.map

data class Tomato(val x: Int, val y: Int, val z: Int, val day: Int)

fun main() {
    val (m, n, h) = readln().split(" ").map(String::toInt)
    val box = Array(h) { Array(n) { IntArray(m) } }
    val dx = arrayOf(1, -1, 0, 0, 0, 0)
    val dy = arrayOf(0, 0, 1, -1, 0, 0)
    val dz = arrayOf(0, 0, 0, 0, 1, -1)
    val queue = ArrayDeque<Tomato>()

    repeat(h) { k ->
        repeat(n) { i ->
            val st = StringTokenizer(readln())
            repeat(m) { j ->
                val value = st.nextToken().toInt()
                box[k][i][j] = value
                if (value == 1) {
                    queue.addLast(Tomato(i, j, k, 0))
                }
            }
        }
    }

    fun bfs(): Int {
        var day = 0

        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            day = cur.day

            repeat(6) { d ->
                val nx = cur.x + dx[d]
                val ny = cur.y + dy[d]
                val nz = cur.z + dz[d]

                if (nx in 0 until n && ny in 0 until m && nz in 0 until h) {
                    if (box[nz][nx][ny] == 0) {
                        box[nz][nx][ny] = 1
                        queue.addLast(Tomato(nx, ny, nz, day + 1))
                    }
                }
            }
        }

        repeat(h) { k ->
            repeat(n) { i ->
                repeat(m) { j ->
                    if (box[k][i][j] == 0) {
                        return -1
                    }
                }
            }
        }

        return day
    }

    print(bfs())
}