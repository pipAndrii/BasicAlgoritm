package DataStructure
//
//class Queue <T>(var element:T? = null,var link:Queue<T>? = null) {
//
//    companion object {
//        var amount: UInt = 0u
//    }
//
//    init {
//        amount++
//    }
//
//    fun enQueue(newElement: T) {
//        if (element == null) {
//            element = newElement
//        } else {
//            var current = this
//            while (current.link != null) {
//                current = current.link!!
//            }
//            current.link = Queue(newElement)
//
//        }
//    }
//
//
//    fun deQueue(): T? {
//
//        if (link == null) {
//            var el = element
//            element = null
//            return el
//        } else {
//            var buff:T = this.element!!
//            this.element = this.link!!.element
//            this.link = this.link!!.link
//            return buff
//        }
//        amount--
//
//    }
//    fun isEmpty():Boolean {
//        if (this.deQueue() == null) {
//            return true
//        } else
//        {
//            return false
//        }
//    }
//
//    fun Print() {
//        println(element)
//        this.link?.Print()
//    }
//
//
//}


class Queue<T>(var element: T? = null, var link: Queue<T>? = null) {
    companion object {
        var amount: UInt = 0u
    }

    init {
        amount++
    }

    fun enQueue(newElement: T) {
        if (element == null) {
            element = newElement
        } else {
            var current = this
            while (current.link != null) {
                current = current.link!!
            }
            current.link = Queue(newElement)
        }
    }

    fun deQueue(): T? {
        if (link == null) {
            val el = element
            element = null
            return el
        } else {
            val buff: T = this.element!!
            this.element = this.link!!.element
            this.link = this.link!!.link
            return buff
        }
        amount--
    }
    fun peek():T?
    {
            return element
    }
    fun isEmpty(): Boolean {
        return element == null && link == null
    }

    fun Print() {
        println(element)
        this.link?.Print()
    }
}