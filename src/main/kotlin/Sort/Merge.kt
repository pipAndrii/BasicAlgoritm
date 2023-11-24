package Sort
fun sortMerge(list: MutableList<Int>):MutableList<Int>
{
    val sortedList = divider(list)
    return sortedList
}


fun divider(list: MutableList<Int>):MutableList<Int>
{
    if (list.size == 1)
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
    var i = 0
    var j = 0
    var k = 0

    while (i<left.size && j<right.size)
    {
        if (left[i]>right[j])
        {
            list.add(k,right[j])
            j++
        }
        else
        {
            list.add(k,left[i])
            i++
        }
        k++

    }

    while (i<left.size)
    {
        list.add(k,left[i])
        i++
        k++
    }
    while (j<right.size)
    {
        list.add(k,right[j])
        j++
        k++
    }
    return list
}







