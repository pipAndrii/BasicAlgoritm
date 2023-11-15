fun sortSelection(list: MutableList<Int>):MutableList<Int>
{
    var sortedList = list
    var bufferFirst:Int = 0
    var bufferSecond:Int = 0
    var bufferIndex:Int = 0
    for (i in 0..list.size-1)
    {
        bufferFirst = list[i]
        for (j in i+1..list.size-1)
        {
            if(bufferFirst > list[j])
            {
                bufferFirst = list[j]
                bufferIndex = j // index
            }
        }
        bufferSecond = list[i]
        list[i] = bufferFirst
        list[bufferIndex] = bufferSecond

    }

    return sortedList
}