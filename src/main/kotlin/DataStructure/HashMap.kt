package DataStructure






class HashMap<K,V>() {
    private val buckets: Array<LinkedList<Node<K, V>?>?>
    var order : Int
    init {
        val size = 5 // The number of buckets in the HashMap
        buckets = Array(size) { LinkedList<Node<K,V>?>()}
        order = 0
    }
    fun put(other: Node<K,V>)
    {
        if (!find(other)) {
            order = other.hashCode() % this.buckets.size
            buckets[order]!!.add(other)
        }
    }


    fun remove(other:Node<K,V>)
    {
        order = other.hashCode() % this.buckets.size
        buckets[order]!!.removeByValue(other)
    }
    fun clear() {
        for (i in buckets)
        {
            i!!.link = null
            i.element = null
        }
    }


    fun find(other:Node<K,V>):Boolean
    {
        val iterator = iterator()
        while (iterator.hasNext()) {
            iterator.next()?.let { element ->
                if (other.hashCode() == element.hashCode())
                {
                    return true
                }
            }
        }
        return false

    }
    fun iterator(): Iterator<Node<K, V>?> {
        return object : Iterator<Node<K, V>?> {
            var currentBucket = 0
            var currentElement = buckets[currentBucket]

            override fun hasNext(): Boolean {
                while (currentBucket < buckets.size-1) {
                    if (currentElement != null) {
                        return true
                    }
                    currentBucket++
                    currentElement = buckets[currentBucket]
                }
                return false
            }

            override fun next(): Node<K, V>? {
                val element = currentElement
                currentElement = currentElement?.link
                return element?.element
            }

        }
    }

    fun keys(): MutableList<K> {
        val list: MutableList<K> = mutableListOf()
        val iterator = iterator()
        while (iterator.hasNext()) {
            iterator.next()?.k?.let { key ->
                list.add(key)
            }
        }
        return list
    }

    fun values(): MutableList<V> {
        val list: MutableList<V> = mutableListOf()
        val iterator = iterator()
        while (iterator.hasNext()) {
            iterator.next()?.v?.let { value ->
                list.add(value)
            }
        }
        return list
    }
   fun print()
   {
       for (i in buckets)
       {
           if (i != null) {
      //         println("$order ===============================")
               i.Print()
           }
       }
   }


   class Node<K, V>(var k: K? = null, var v: V? = null) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Node<*, *>

            if (k != other.k) return false
            if (v != other.v) return false

            return true
        }

        override fun hashCode(): Int {
            var result = k?.hashCode() ?: 0
            result = 31 * result + (v?.hashCode() ?: 0)
            if (result <= 0)
            {
                result *= -1
            }
            return result
        }

        override fun toString(): String {
            return " - $ (k=$k, v=$v)"
        }

    }


}