package DataStructure

class Queue <T>(var element:T? = null,var link:Queue<T>? = null){

    companion object {
        var amount: UInt = 0u
    }
    init {
        amount++
    }
    fun enQueue(newElement: T) {
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
            current.link = Queue(newElement)

        }
    }

    fun deQueue():T?
    {

        if (link == null)
        {
            element = null
            return element
        }
        else
        {
            var buff = this.element
            this.element = this.link!!.element
            this.link = this.link!!.link
            return buff
        }
        amount--
        
    }

    fun Print() {
        println(element)
        this.link?.Print()
    }



}