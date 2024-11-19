import java.util.*

fun main(args: Array<String>){
    var N: Int = readLine()!!.toInt()
    var scan = Scanner(System.`in`)
    var arr: IntArray = IntArray(N, {0})
    for (i: Int in 0 until N)
        arr[i] = scan.nextInt()

    var max: Int = arr[0]
    var min: Int = arr[0]

    for(i: Int in 1 until N){
        if(max < arr[i]) max = arr[i];
        if(min > arr[i]) min = arr[i];
    }

    println("$min $max")
}