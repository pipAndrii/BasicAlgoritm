
fun sortMerge(list: MutableList<Int>):MutableList<Int>
{
    val sortedList = divider(list)
    return sortedList
}


fun divider(list: MutableList<Int>):MutableList<Int>
{
    if (list.size <= 1)
    {
        return list
    }

    val leftNums = 0 until list.size / 2
    val rightNums = (list.size / 2) until list.size

    val left = divider(list.subList(leftNums.first, leftNums.last + 1))  // Handles even indices
    val right = divider(list.subList(rightNums.first, rightNums.last + 1))  // Handles even or odd indices


    return merger(left,right)
}
fun merger(left:MutableList<Int>, right:MutableList<Int>):MutableList<Int>
{
    var list: MutableList<Int> = mutableListOf<Int>()
    list.addAll(left)
    list.addAll(right)

    println("list size : ${list.size} $left $right")








    return list
}



















/*
fun mergeSort(arr: IntArray): IntArray {
    if (arr.size <= 1) {
        return arr
    }

    val mid = arr.size / 2
    val left = mergeSort(arr.sliceArray(0 until mid))
    val right = mergeSort(arr.sliceArray(mid until arr.size))

    return merge(left, right)
}

fun merge(left: IntArray, right: IntArray): IntArray {
    val merged = IntArray(left.size + right.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            merged[k] = left[i]
            i++
        } else {
            merged[k] = right[j]
            j++
        }
        k++
    }

    while (i < left.size) {
        merged[k] = left[i]
        i++
        k++
    }

    while (j < right.size) {
        merged[k] = right[j]
        j++
        k++
    }

    return merged
}*/
