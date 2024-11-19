import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>){
    //var sb: StringBuilder = StringBuilder()
    var scan: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var stack: Stack<Int> = Stack()
    var sum: Int = 0
    var N: Int = scan.readLine().toInt()
    for (i: Int in 0 until N){
        var number: Int = scan.readLine().toInt()
        if (number != 0) {
            stack.push(number)
            sum += number
        }
        else {
            sum -= stack.pop()
        }
    }
    println(sum)
}