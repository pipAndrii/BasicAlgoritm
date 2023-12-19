package DataStructure

import java.util.Dictionary
import java.util.IllegalFormatCodePointException
import kotlin.collections.HashMap

 class Graph() {
     var amountOfNodes: Int
     var amountOfEfges: Int


     val hashMap: HashMap<Node, MutableSet<Node>>

     init {

         hashMap = HashMap<Node, MutableSet<Node>>()
         amountOfNodes = 0
         amountOfEfges = 0
     }

     fun getNodes(): Int = this.amountOfNodes
     fun getEdges(): Int = this.amountOfEfges

     fun setNodes(value: Int) {
         this.amountOfNodes = value
     }

     fun setEdges(value: Int) {
         this.amountOfEfges = value
     }

     fun addNode(node: Node, set: MutableSet<Node>) {
        set.remove(node)
         hashMap.putIfAbsent(node,set)
     }
     fun removeNode(node:Node)
     {
         if(hashMap.containsKey(node)) {
             hashMap.remove(node)

             for (i in hashMap) {
                 if (i.value.contains(node)) {
                     i.value.remove(node)
                 }
             }
         }
     }
     fun getFirstAndLast(): Pair<Node, Node> {
         val sorted = hashMap.toSortedMap(compareBy { it.name })
         val firstNode = sorted.firstKey()
         val lastNode = sorted.lastKey()
         return Pair(firstNode, lastNode)
     }
    fun makeQueueFromMuttableSet(set:MutableSet<Node>):Queue<Node>
    {
        var queue:Queue<Node> = Queue()
        for (i in set)
        {
            queue.enQueue(i)
        }
        return queue
    }


    private fun backTraverse(map: MutableMap<Node, Node>, start: Node, find: Node): MutableSet<Node> {
         val resultSet: MutableSet<Node> = mutableSetOf(find)
         var currentNode = find

         while (currentNode != start) {
             val previousNode = map[currentNode] ?: break
             resultSet.add(previousNode)
             currentNode = previousNode
         }

         return resultSet.reversed().toMutableSet()
     }

     fun BFS(start: Node, find: Node): MutableSet<Node> {
         val resultSet: MutableSet<Node> = mutableSetOf(start)
         val checked = mutableSetOf<Node>()
         val queue: Queue<Node> = Queue(start)
         val map: MutableMap<Node, Node> = mutableMapOf()

         while (!queue.isEmpty()) {
             val currentNode = queue.deQueue()

             // Check if the current node is the target node
             if (currentNode == find) {
                 return backTraverse(map, start, find)
             }

             // Add the current node to the checked set
             checked.add(currentNode!!)

             // Get the connections of the current node
             val connections = hashMap.getOrDefault(currentNode, mutableSetOf())

             for (connection in connections) {
                 if (!checked.contains(connection)) {
                     queue.enQueue(connection)
                     map[connection] = currentNode
                 }
             }
         }

         println("No answer found")
         return resultSet
     }

     override fun toString(): String {
         val entries = hashMap.entries.joinToString() { (node, set) ->
             "Node - ${node.toString()}    {${set.toString()}}\n"
         }
         return "Graph(amountOfNodes=$amountOfNodes, amountOfEfges=$amountOfEfges,\n hashMap={\n$entries})"
     }
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     class Node() {
         var name:String

         init {

             name = " "
         }

         fun getMyName(): String = this.name

         fun setMyName(value: String) {
             this.name = value
         }
         override fun toString(): String {
             return "($name)"
         }

     }

 }


//          main code for graph
//
//val nodeList = mutableListOf<Graph.Node>()
//
//val n = 10 // Number of nodes
//val m = 3 // Number of set elements
//
//// Create nodes and add them to the nodeList
//for (i in 0 until n) {
//    val node = Graph.Node()
//    node.setMyName(('A' + i).toString())
//    nodeList.add(node)
//}
//
//val myGraph = Graph()
//nodeList.sortBy { it.getMyName() }
//// Create sets and add nodes to the graph using loops
//for (i in 0 until n) {
//    val set = mutableSetOf<Graph.Node>()
//    for (j in 0 until m) {
//        set.add(nodeList.random())
//    }
//    myGraph.addNode(nodeList[i], set)
//}
//
//
//println(myGraph)
//
//var pair = myGraph.getFirstAndLast()
//println( "look path - $pair")
//
//var way = myGraph.BFS(pair.first,pair.second)
//println("the way is - $way ")
