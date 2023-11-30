package DataStructure

class Stack<T> {
    private var top: Node<T>? = null

    fun push(element: T) {
        val newNode = Node(element)
        newNode.next = top
        top = newNode
    }

    fun pop(): T? {
        if (isEmpty()) {
            return null
        }
        val poppedElement = top?.data
        top = top?.next
        return poppedElement
    }

    fun peek(): T? {
        return top?.data
    }

    fun isEmpty(): Boolean {
        return top == null
    }

    fun size(): Int {
        var count = 0
        var current = top
        while (current != null) {
            count++
            current = current.next
        }
        return count
    }

    fun print() {
        var current = top
        while (current != null) {
            println("Stack: ${current.data}")
            current = current.next
        }
    }

    private inner class Node<T>(var data: T? = null, var next:Node<T>? = null) {
    }
}