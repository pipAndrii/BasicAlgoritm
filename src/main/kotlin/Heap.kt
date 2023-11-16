fun sortHeap(list: MutableList<Int>):MutableList<Int>
{

    var tree = Tree()
    var treeList = buildTree(list)
    for (i in treeList)
    {
        println("tree - $i" )
    }
    return list
}



class Tree(max: Int = 0,min: Int = 0,element: List<Int> = listOf()) {}
fun buildTree(list: MutableList<Int>):MutableList<Pair<Int,Int>>
{
    var tree:MutableList<Pair<Int,Int>> = mutableListOf()
    for (i in 0 ..list.size-2)
    {
        if (list[i]<list[i+1])
        {
            tree.add(i, Pair(list[i+1],list[i]))
        }
        else
        {
            tree.add(i, Pair(list[i],list[i+1]))
        }


        if (tree[i]<tree[i+1])
        {

        }
    }

    return tree
}

//private operator fun <A, B> Pair<A, B>.compareTo(pair: Pair<B, B>): Int {
//
//}
//    fun heapify(tree:MutableList<List<Int>>):MutableList<List<Int>>
//    {
//        for (i in tree)
//        {
//            for (j in )
//            for (i[0]>j[0])
//        }
//
//
//        return tree
//    }
