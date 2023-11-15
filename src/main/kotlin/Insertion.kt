fun sortInsertion(list: MutableList<Int>):MutableList<Int>
{
    var sortedList = list
    var buffer:Int = 0
    for (i in 0..list.size-2)
    {
        for (j in i downTo  0)
        {
            if(list[j+1] < list[j])
            {
                buffer = list[j]
                list[j] = list[j+1]
                list[j+1] = buffer
            }
        }
    }
    return sortedList
}