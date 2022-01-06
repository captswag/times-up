package leetcode._707

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true
    val linkedList = MyLinkedList()

    while (loop) {
        print("1. Get\n2. Add at head\n3. Add at tail\n4. Add at Index\n5. Delete at Index\n6. Display formatted\n7. Exit\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the index at which to retrieve value from: ")
                val index = scanner.nextInt()
                println("The value at index $index is ${linkedList.get(index)}")
            }
            2 -> {
                print("Enter the value to be inserted at the head: ")
                linkedList.addAtHead(scanner.nextInt())
            }
            3 -> {
                print("Enter the value to be inserted at the tail: ")
                linkedList.addAtTail(scanner.nextInt())
            }
            4 -> {
                print("Enter the index position at which you want to insert value: ")
                val index = scanner.nextInt()
                print("Enter the value to be inserted: ")
                linkedList.addAtIndex(index, scanner.nextInt())
            }
            5 -> {
                print("Enter the index to be deleted: ")
                linkedList.deleteAtIndex(scanner.nextInt())
            }
            6 -> {
                linkedList.root?.displayFormatted()
            }
            7 -> {
                loop = false
                println("Exiting...")
            }
        }
    }
}