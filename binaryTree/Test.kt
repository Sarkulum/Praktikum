package binaryTree

fun main() {
    val tree = BinaryTree<Int>()

    tree.add(50)
    tree.add(30)
    tree.add(70)
    tree.add(20)
    tree.add(40)
    tree.add(60)
    tree.add(80)

    println("contains 40? ${tree.contains(40)}") // true
    println("contains 25? ${tree.contains(25)}") // false

    println("In-Order travers:")
    tree.traverseInOrder() // Output: 20 30 40 50 60 70 80
}
