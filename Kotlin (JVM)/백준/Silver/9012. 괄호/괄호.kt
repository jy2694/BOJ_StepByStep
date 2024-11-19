import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>){
    var sb: StringBuilder = StringBuilder()
    var scan: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var stack: Stack<Char> = Stack()
    var N: Int = scan.readLine().toInt()
    loop@ for (i: Int in 0 until N){
        stack.clear()
        var data: CharArray = scan.readLine().toCharArray()
        for (c: Char in data){
            if (c == '(') stack.push(c)
            else {
                if(stack.empty()){
                    sb.append("NO\n");
                    continue@loop
                } else stack.pop()
            }
        }
        if(!stack.empty())sb.append("NO\n");
        else sb.append("YES\n");
    }
    println(sb)
}