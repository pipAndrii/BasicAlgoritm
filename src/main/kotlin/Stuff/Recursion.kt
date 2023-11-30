package Stuff

fun recursiveFactorial(n:Int):Int
{
    if (n <= 1)
    {
        return n
    }
    return n * recursiveFactorial(n-1)
}

fun recursiveSummation(n:Int):Int
{
    if (n <= 1)
    {
        return n
    }
    return n + recursiveSummation(n-1)
}



fun summation(n:Int):Int
{
    return n*n
}

fun multiplication(n:Int):Int
{

    var result = 1
    for (i in 1..n)
    {
        result = result * n
    }
    return result
}





fun recursiveExponentiationNMinus(n:Int):Int {
    if (n <= 1) {
        return n
    }
    var result = Math.pow(n.toDouble(), recursiveExponentiationNMinus(n - 1).toDouble())
    return result.toInt()
}



fun recursiveExponentiationN(pair: Pair<Int, Int>): Pair<Int, Int> {
    if (pair.second <= 1) {
        return pair
    }

    val result = Math.pow(pair.first.toDouble(), recursiveExponentiationN(Pair(pair.first, pair.second - 1)).first.toDouble()).toInt()

    return Pair(result, pair.second - 1)
}



// ХВОСТОВА РЕКУРСІЯ
fun Phobonachi(triple: Triple<Int,Int,Int>):Triple<Int,Int,Int>
{
    if (triple.first == 0)
    {
        println(triple.second)
        println(triple.third)
    }
    if (triple.first == 100)
    {
        return triple
    }
    var n = triple.first + 1
    var a = triple.third
    var b = triple.second+triple.third
    println(b)
    return Phobonachi(Triple(n,a,b))

}
