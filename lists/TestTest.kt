package lists

fun main() {
    val linkedList = SinglyLinkedList()

    println("Adding elements to the list:")
    linkedList.addFirst(10)
    linkedList.addLast(20)
    linkedList.addLast(30)
    linkedList.printList() // Output: 10 -> 20 -> 30

    println("\nSetting the first element to 15:")
    linkedList.setFirst(15)
    linkedList.printList() // Output: 15 -> 20 -> 30

    println("\nSetting the last element to 35:")
    linkedList.setLast(35)
    linkedList.printList() // Output: 15 -> 20 -> 35

    println("\nRemoving the first element:")
    linkedList.removeFirst()
    linkedList.printList() // Output: 20 -> 35

    println("\nGetting the last element:")
    val last = linkedList.getLast()
    println("Last element is: $last") // Output: Last element is: 35

    println("\nRemoving the last element:")
    linkedList.removeLast()
    linkedList.printList() // Output: 20

    println("\nAdding multiple elements and printing again:")
    linkedList.addLast(40)
    linkedList.addLast(50)
    linkedList.addFirst(5)
    linkedList.printList() // Output: 5 -> 20 -> 40 -> 50

    println("\nChanging value of certain nodes:")
    linkedList.add(2, 10)
    linkedList.printList() // Output: 5 -> 30 -> 40 -> 50

    println("\nSetting certain nodes to specific value:")
    linkedList.set(1, 33)
    linkedList.printList() // Output: 33 -> 30 -> 40 -> 50

    println("\nSubtraction of a certain node:")
    linkedList.remove(4, 30)
    linkedList.printList() // Output: 5 -> 30 -> 40 -> 20
}
