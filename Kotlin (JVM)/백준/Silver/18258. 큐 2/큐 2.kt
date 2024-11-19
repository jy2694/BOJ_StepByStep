import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>){
    var sb: StringBuilder = StringBuilder()
    var scan: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var N: Int = scan.readLine().toInt()
    var queue: Deque<Int> = LinkedList()
    while (N-- > 0){
        var st: StringTokenizer = StringTokenizer(scan.readLine())
        when(st.nextToken()){
            "push" -> { queue.offer(st.nextToken().toInt()) }
            "pop" -> { sb.append(if(queue.isEmpty()) -1 else queue.poll()).append("\n")}
            "size" -> {sb.append(queue.size).append("\n")}
            "empty" -> {sb.append(if(queue.isEmpty()) 1 else 0).append("\n")}
            "front" -> {sb.append(if(queue.isEmpty()) -1 else queue.peek()).append("\n")}
            "back" -> {sb.append(if(queue.isEmpty()) -1 else queue.peekLast()).append("\n")}
        }
    }
    println(sb)
}