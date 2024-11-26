package binaryTree

class TreeNode<T : Comparable<T>>(val value: T) {
    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null
}
