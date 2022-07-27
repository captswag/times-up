package basics.heap

class Heap(size: Int) {

    var current = 0
    val array = IntArray(size)

    fun insert(num: Int) {
        array[current] = num
        heapifyUp(current)
        current++
    }

    private fun heapifyUp(index: Int) {
        var index = index
        while (hasParent(index)) {
            val parentIndex = getParentIndex(index)
            if (array[index] > array[parentIndex]) {
                swap(index, parentIndex)
                index = parentIndex
            } else {
                break
            }
        }
    }

    fun remove(): Int {
        return if (current == 0) {
            throw IllegalStateException()
        } else {
            val value = array[0]
            array[0] = array[--current]
            heapifyDown()
            value
        }
    }

    private fun heapifyDown() {
        var index = 0
        while (hasLeftChild(index)) {
            var largerChildIndex = getLeftChildIndex(index)
            if (hasRightChild(index)) {
                val rightChildIndex = getRightChildIndex(index)
                if (array[rightChildIndex] > array[largerChildIndex]) {
                    largerChildIndex = rightChildIndex
                }
            }

            if (array[largerChildIndex] > array[index]) {
                swap(largerChildIndex, index)
                index = largerChildIndex
            } else {
                break
            }
        }
    }

    private fun hasParent(index: Int): Boolean {
        return index != 0
    }

    private fun getParentIndex(index: Int): Int {
        return (index - 1) / 2
    }

    private fun hasLeftChild(index: Int): Boolean {
        return getLeftChildIndex(index) < current
    }

    private fun getLeftChildIndex(index: Int): Int {
        return 2 * index + 1
    }

    private fun hasRightChild(index: Int): Boolean {
        return getRightChildIndex(index) < current
    }

    private fun getRightChildIndex(index: Int): Int {
        return 2 * index + 2
    }

    private fun swap(index1: Int, index2: Int) {
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    }

    fun print() {
        var index = 0
        while (index < current) {
            if (index == 0) {
                print(array[index])
            } else {
                print(", ${array[index]}")
            }
            index++
        }
        println()
    }
}