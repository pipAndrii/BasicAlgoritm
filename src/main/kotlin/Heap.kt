

fun sortHeap(list: MutableList<Int>):Node

{

    val tree: Node = Node(list[list.size/2])
    for (i in 0 until list.size)
    {
        if (i == list.size/2) continue
         tree.addNode(list[i])
    }
    tree.printTree()

    return tree
}








class Node(var root: Int = 0, var parent:Node? = null, var left: Node? = null, var right: Node? = null) {



    fun addNode(num: Int) {
        var buffer = 0



        //write next one or swap if bigger
        if(num > this.root)
        {
            buffer = this.root
            this.root = num
            this.left = Node(buffer)

        }
        else
        {
            // if there is left or right
            if (this.left != null || this.right != null) {

                // write left or right
                if (this.left!!.root > num)
                {
                    this.right = this.left
                    this.left = Node(num)
                }

                else
                {
                    this.right = Node(num)
                }
            }
            // unless there no elements create just left
            else
            {
                this.left = Node(num)
            }



        }

    }


    fun printTree() {
        printTree(this)
    }



}

private fun printTree(node: Node?, level: Int = 0) {
    if (node != null) {
        printTree(node.right, level + 1)
        println(" ".repeat(level * 4) + node.root)
        printTree(node.left, level + 1)
    }
}






//fun makeTree(list: MutableList<Int>): Node {
//    val root: Node = Node(list[0])
//
//    val log = log2(list.size.toDouble()).toInt()
//
//    for (i in 1 until log) {
//        val start = Math.pow(2.0, i.toDouble()).toInt()
//        val end = Math.pow(2.0, (i + 1).toDouble()).toInt()
//
//        for (j in start until end) {
//            if (j < list.size - 2) {
//
//                if (j<end-2)
//                {
//                    root.setLeft(Node(list[j]))
//                }
//                if (j<end-1)
//                {
//                    root.setRight(Node(list[j]))
//                }
//            }
//        }
//    }
//    return root
//
//}
//
//class Node(var root: Int, var left: Node? = null, var right: Node? = null) {
//    // Getter for the root property
//    fun getValue(): Int {
//        return root
//    }
//
//    // Setter for the root property
//    fun setValue(newValue: Int) {
//        root = newValue
//    }
//
//    // Getter for the left property
//    fun getLeft(): Node? {
//        return left
//    }
//
//    // Setter for the left property
//    fun setLeft(newLeft: Node?) {
//        left = newLeft
//    }
//
//    // Getter for the right property
//    fun getRight(): Node? {
//        return right
//    }
//
//    // Setter for the right property
//    fun setRight(newRight: Node?) {
//        right = newRight
//    }
//}
//
// fun printInOrder(node: Node?) {
//    if (node != null) {
//        printInOrder(node.left)
//        println(node.root)
//        printInOrder(node.right)
//    }
//}










//for (i in 0 until list.size step 3) {
//    println("father - ${list[i]}")
//    if (i + 1 < list.size) {
//        print(" left - ${list[i + 1]}")
//    }
//    if (i + 2 < list.size) {
//        print("  right - ${list[i + 2]}")
//    }
//    println()
//}
