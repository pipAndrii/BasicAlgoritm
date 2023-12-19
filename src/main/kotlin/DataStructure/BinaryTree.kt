package DataStructure

class Node<T : Comparable<T>>(var root: T? = null, var left: Node<T>? = null, var right: Node<T>? = null) : Comparable<Node<T>> {
    override fun compareTo(other: Node<T>): Int {
        return this.root?.compareTo(other.root!!) ?: 0
    }
    fun addNode(element: T): Node<T> {
        if (element > root!!) {
            if (right == null) {
                right = Node(element)
                return right!!
            } else {
                return right!!.addNode(element)
            }
        } else {
            if (left == null) {
                left = Node(element)
                return left!!
            } else {
                return left!!.addNode(element)
            }
        }
    }
//    fun find(other: Node<T>):Boolean
//    {
//
//
//    }



//    left?.printInorder()
//    root?.let { println(it) }
//    right?.printInorder()
    fun removeNode(element: T){

    }

    fun printInorder() {
        left?.printInorder()
        root?.let { println(it) }
        right?.printInorder()
    }


}


