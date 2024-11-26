package lists

class ListNode(var value: Int, var next: ListNode? = null) {
    override fun toString(): String {
        return value.toString()
    }
}

class SinglyLinkedList {
    private var head: ListNode? = null

    fun addFirst(value: Int) {
        val newNode = ListNode(value, head)
        head = newNode
    }

    fun setFirst(value: Int) {
        if (head == null) {
            throw NoSuchElementException("List is empty")
        }
        head!!.value = value
    }

    fun removeFirst() {
        if (head == null) {
            throw NoSuchElementException("List is empty")
        }
        head = head!!.next
    }

    fun addLast(value: Int) {
        val newNode = ListNode(value)
        if (head == null) {
            head = newNode
            return
        }
        var current = head
        while (current!!.next != null) {
            current = current.next
        }
        current.next = newNode
    }

    fun setLast(value: Int) {
        if (head == null) {
            throw NoSuchElementException("List is empty")
        }
        var current = head
        while (current!!.next != null) {
            current = current.next
        }
        current.value = value
    }

    fun getLast(): Int {
        if (head == null) {
            throw NoSuchElementException("List is empty")
        }
        var current = head
        while (current!!.next != null) {
            current = current.next
        }
        return current.value
    }

    fun removeLast() {
        if (head == null) {
            throw NoSuchElementException("List is empty")
        }
        if (head!!.next == null) {
            head = null
            return
        }
        var current = head
        while (current!!.next!!.next != null) {
            current = current.next
        }
        current.next = null
    }

    fun printList() {
        var current = head
        val values = mutableListOf<Int>()
        while (current != null) {
            values.add(current.value)
            current = current.next
        }
        println(values.joinToString(" -> "))
    }

    fun add(position: Int, value: Int) {
        var current = head
        var index = 2
        while (position > index) {
            current = current!!.next
            index++
        }
        current!!.next!!.value += value
    }

    fun set(position: Int, value: Int) {
        var current = head
        var index = 2
        while (position > index) {
            current = current!!.next
            index++
        }
        current!!.next!!.value = value
    }

    fun remove(position: Int, value: Int) {
        var current = head
        var index = 2
        while (position > index) {
            current = current!!.next
            index++
        }
        current!!.next!!.value -= value
    }
}
