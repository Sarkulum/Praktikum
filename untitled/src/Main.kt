fun main() {
    val list = DoublyLinkedList()

    list.add(10)
    list.add(20)
    list.add(30)
    list.add(222)

    println("Traverse Forward:")
    list.forward() // Output: 10 -> 20 -> 30 -> null

    println("Traverse Backward:")
    list.backward() // Output: 30 -> 20 -> 10 -> null

    list.remove(20)
    println("After Removing 20:")
    list.forward() // Output: 10 -> 30 -> null

    println("Finding Value:")
    list.find(222)
    list.find(223) // Output: Could not find Value or Found Value at position.

}
