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
fun Phobonachi(pair: Pair<Int,Int>):Pair<Int,Int>
{
    if (pair.second >= 10000)
    {
        return pair
    }

    var a = pair.second
    var b = pair.first+pair.second
    println(b)
    return Phobonachi(Pair(a,b))

}
