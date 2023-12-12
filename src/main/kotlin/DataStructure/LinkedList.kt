package DataStructure

class LinkedList<T>(var element:T? = null,var link:LinkedList<T>? = null) {

    companion object {
        var amount: UInt = 0u
    }
    init {
        amount++
    }
    fun add(newElement: T) {

        if (element == null)
        {
           element = newElement
        }
        else
        {
            var current = this
            while (current.link != null)
            {
                current = current.link!!
            }
            current.link = LinkedList(newElement)
        }

    }

    fun removeLast() {

        if (this.link != null) {
            var current = this
            var beforeLast = this
            while (current.link != null) {
                beforeLast = current
                current = current.link!!
            }
            beforeLast.link = null
            amount--
        }
        else
        {
            this.element = null
        }
    }

    fun removeFirst() {

        if (this.link != null) {
            var buffer = this.link!!
            this.element = buffer.element
            this.link = buffer.link!!
            amount--
        }
        else
        {
            this.element = null
        }
    }
    fun removeByValue(value:T) {

        // if first element is looked for
        if (link == null && element == value)
        {
            this.element = null
            amount--
        }
        var current = this
        var beforeLast = this
        while (current.link != null) {
            if (current.element == value)
            {
                beforeLast.link = current.link
                amount--
                break
            }
            beforeLast = current
            current = current.link!!
        }
        if (current.element == value) {
            current.element = null
            amount--
        }

    }


//           fun next(): LinkedList<T> {
//               var current = this
//               if (current.link != null)
//               {
//                   current = current.link!!
//               }
//            return current
//            }

    fun isEmpty():Boolean
    {
        if (this.element == null)
        {
            return true
        }
        else
        {
            return false
        }
    }
    fun Print() {

        if (element != null) println(element)
        this.link?.Print()

           println()

    }
}