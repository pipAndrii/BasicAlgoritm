package Sort

fun sortBubble(list: MutableList<Int>):MutableList<Int>
{
    var sortedList = list
    var buffer:Int = 0
    for (i in 0..list.size-1)
    {
        for (j in i..list.size-1)
        {
            if(list[i]>list[j])
            {
                buffer = list[i]
                list[i] = list[j]
                list[j] = buffer
            }
        }
    }


    return sortedList
}