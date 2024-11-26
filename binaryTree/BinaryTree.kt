package binaryTree

class BinaryTree<T : Comparable<T>> {
    private var root: TreeNode<T>? = null

    fun add(value: T) {
        root = addRecursive(root, value)
    }

    private fun addRecursive(current: TreeNode<T>?, value: T): TreeNode<T> {
        if (current == null) {
            return TreeNode(value)
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value)
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value)
        }
        return current
    }

    fun contains(value: T): Boolean {
        return containsRecursive(root, value)
    }

    private fun containsRecursive(current: TreeNode<T>?, value: T): Boolean {
        if (current == null) {
            return false
        }
        return when {
            value == current.value -> true
            value < current.value -> containsRecursive(current.left, value)
            else -> containsRecursive(current.right, value)
        }
    }

    fun traverseInOrder() {
        traverseInOrderRecursive(root)
        println()
    }

    private fun traverseInOrderRecursive(node: TreeNode<T>?) {
        if (node != null) {
            traverseInOrderRecursive(node.left)
            print("${node.value} ")
            traverseInOrderRecursive(node.right)
        }
    }
}
