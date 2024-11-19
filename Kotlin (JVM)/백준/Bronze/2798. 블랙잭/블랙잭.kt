import java.util.StringTokenizer

fun main(args: Array<String>){
    var NM: StringTokenizer = StringTokenizer(readLine())
    var cards: StringTokenizer = StringTokenizer(readLine())
    var N: Int = NM.nextToken().toInt()
    var M: Int = NM.nextToken().toInt()
    var array: IntArray = IntArray(N)
    for (i: Int in array.indices)
        array[i] = cards.nextToken().toInt()
    var max = 0
    for(i: Int in array){
        var array2: IntArray = array.clone().filter { it != i }.toIntArray()
        for(j: Int in array2){
            var array3: IntArray = array2.clone().filter { it != j }.toIntArray()
            for(n: Int in array3){
                if(i+j+n in max+1.. M){
                    max = i+j+n
                }
            }
        }
    }
    println(max)
}