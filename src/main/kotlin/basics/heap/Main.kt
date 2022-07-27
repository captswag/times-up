package basics.heap

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true

    print("Enter the size of the heap: ")
    val heap = Heap(scanner.nextInt())

    while (loop) {
        print("1. Insert\n2. Remove\n3. Print\n4. Exit\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the value to be inserted: ")
                try {
                    heap.insert(scanner.nextInt())
                } catch (exception: ArrayIndexOutOfBoundsException) {
                    println("Heap is full")
                }
            }
            2 -> {
                try {
                    println("The maximum value in the heap is: ${heap.remove()}")
                } catch (exception: IllegalStateException) {
                    println("Heap is empty")
                }
            }
            3 -> {
                print("The elements in the heap are: ")
                heap.print()
            }
            4 -> {
                loop = false
                println("Exiting...")
            }
            else -> {
                loop = false
                println("Exiting...")
            }
        }
    }
}