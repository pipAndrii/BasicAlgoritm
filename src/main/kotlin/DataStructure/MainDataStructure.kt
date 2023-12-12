package DataStructure

import kotlin.collections.HashMap

fun MainDataStructure()
{
//    var linkedList:LinkedList<Int> = LinkedList()
//    linkedList.add(1)
//    linkedList.add(2)
//    linkedList.add(3)
//    linkedList.add(4)
//
//
//
//    linkedList.Print()
//    println("-----------------------")
//    linkedList.removeByValue(2)
//    linkedList.Print()

//    println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
//        var queue:Queue<Int> = Queue()
//    queue.enQueue(1)
//    queue.enQueue(2)
//    queue.enQueue(3)
//    queue.enQueue(4)
//
//
//
//    queue.Print()
//    queue.deQueue()
//    queue.deQueue()
//    queue.deQueue()
//    println("----------------------------")
//    queue.Print()
//    println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
//
//    var stack:Stack<Int> = Stack()
//
//    stack.push(1)
//    stack.push(2)
//    stack.push(3)
//    stack.push(4)
//
//    stack.pop()
//
//    stack.print()


 var muHashMap:DataStructure.HashMap<Int,String> = DataStructure.HashMap()

    muHashMap.put(DataStructure.HashMap.Node(1, "apple"))
  muHashMap.put(DataStructure.HashMap.Node(2, "banana"))
   muHashMap.put(DataStructure.HashMap.Node(3, "cherry"))
  muHashMap.put(DataStructure.HashMap.Node(4, "date"))
   muHashMap.put(DataStructure.HashMap.Node(5, "elderberry"))

   muHashMap.put(DataStructure.HashMap.Node(11, "11"))
    muHashMap.put(DataStructure.HashMap.Node(22, "22"))
    muHashMap.put(DataStructure.HashMap.Node(33, "33"))
   muHashMap.put(DataStructure.HashMap.Node(44, "44"))
  muHashMap.put(DataStructure.HashMap.Node(55, "55"))
    muHashMap.put(DataStructure.HashMap.Node(55, "55"))
    muHashMap.put(DataStructure.HashMap.Node(55, "55"))
    muHashMap.put(DataStructure.HashMap.Node(55, "55"))
    muHashMap.print()

    println(muHashMap.keys())
    println(muHashMap.values())

    println("------------------------------------")
    println(muHashMap.find(DataStructure.HashMap.Node(55, "elderberry")))

   muHashMap.clear()





    muHashMap.print()
}
