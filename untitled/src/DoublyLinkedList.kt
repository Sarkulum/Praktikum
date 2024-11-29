class DoublyLinkedList {
    private var head: Node? = null
    private var tail: Node? = null

    fun add(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            newNode.prev = tail
            tail = newNode
        }
    }

    fun remove(value: Int): Boolean {
        var current = head
        while (current != null) {
            if (current.value == value) {
                val prevNode = current.prev
                val nextNode = current.next

                if (prevNode != null) {
                    prevNode.next = nextNode
                } else {
                    head = nextNode
                }

                if (nextNode != null) {
                    nextNode.prev = prevNode
                } else {
                    tail = prevNode
                }

                return true
            }
            current = current.next
        }
        return false
    }

    fun forward() {
        var current = head
        while (current != null) {
            print("${current.value} -> ")
            current = current.next
        }
        println("null")
    }

    fun backward() {
        var current = tail
        while (current != null) {
            print("${current.value} -> ")
            current = current.prev
        }
        println("null")
    }

    fun find(value: Int) {
        var current = head
        var index = 0
        while (current?.value != value && current?.next != null) {
            current = current?.next
            index++
        }
        if(current?.value == value) {
            println("Found ${current.value} at Position $index.")
        }else{
            println("Could not find $value.")
        }
    }
}
