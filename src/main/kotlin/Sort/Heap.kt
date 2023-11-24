package Sort

fun sortHeap(list: MutableList<Int>):MutableList<Int>
{
    val tree: Node = Node(list[0])
    for (i in 1 until list.size)
    {
         tree.addNode(list[i])
    }

    val treeList = TreeToList(tree)
    treeList.reverse()
    return treeList
}



class Node(var root: Int = 0, var left: Node? = null, var right: Node? = null) {
    fun addNode(num: Int): Node {
        if (num > root) {
            if (right == null) {
                right = Node(num)
                return right!!
            } else {
                return right!!.addNode(num)
            }
        } else {
            if (left == null) {
                left = Node(num)
                return left!!
            } else {
                return left!!.addNode(num)
            }
        }
    }
}

 fun TreeToList(node: Node?, level: Int = 0, list: MutableList<Int> = mutableListOf()):MutableList<Int> {
    if (node != null) {
        TreeToList(node.right, level + 1,list)
        if (node.left != null)
        {
            // left
            list.add(node.root)
        }
        else
        {
            // right
            list.add(node.root)
        }
        TreeToList(node.left, level + 1,list)
    }
    return list
}
