import kotlin.random.Random

const val num = 11
fun main() {
    // list and sorting
    var list = generateList(num)
    printList(list)
    printList(sortBubble(list))
    println()
    // list and sorting
    list = generateList(num)
    printList(list)
    printList(sortInsertion(list))
    println()
    // list and sorting
    list = generateList(num)
    printList(list)
    printList(sortSelection(list))
    println()

    // list and sorting
    list = generateList(num)
    printList(list)
    printList(sortMerge(list))
    println()

    // list and sorting
    list = generateList(num)
    printList(list)
    println(sortHeap(list))
    println()

}


fun generateList(length: Int): MutableList<Int> {
    val random = Random
    val list = MutableList(length) { random.nextInt(0, 100) }
    return list
}

fun printList(list: MutableList<Int>)
{

    for (i in 0..list.size-1)
    {
        print("${list[i]} \t")
    }
    println("| min : ${list.min()} \t max : ${list.max()}")
}












