package DataStructure

class Queue <T>{

    private var present: Node<T>? = null
    fun size(): Int {
        var count = 0
        var current = present
        while (current != null) {
            count++
            current = current.link!!.present
        }
        return count
    }
//    fun enQueue(newElement: T) {
//        if (element == null)
//        {
//            element = newElement
//        }
//        else
//        {
//            var current = this
//            while (current.link != null)
//            {
//                current = current.link!!
//            }
//            current.link = Queue(newElement)
//
//        }
//    }
//
//    fun deQueue():T?
//    {
//
//        if (link == null)
//        {
//            element = null
//            return element
//        }
//        else
//        {
//            var buff = this.element
//            this.element = this.link!!.element
//            this.link = this.link!!.link
//            return buff
//        }
//        amount--
//
//    }
//
//    fun Print() {
//        println(element)
//        this.link?.Print()
//    }

    private inner class Node<T>(var element:T,var link:Queue<T>? = null){}

}