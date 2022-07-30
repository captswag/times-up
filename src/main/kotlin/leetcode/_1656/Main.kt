package leetcode._1656

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true

    print("Enter the value of n: ")
    val orderedStream = OrderedStream(scanner.nextInt())

    while (loop) {
        print("1. Insert\n2. Exit\nEnter your choice: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Enter the id: ")
                val id = scanner.nextInt()
                print("Enter the value: ")
                val value = scanner.next()
                val output = orderedStream.insert(id, value)
                output.displayFormatted()
            }
            2 -> {
                println("Exiting...")
                loop = false
            }
            3 -> {
                println("Exiting...")
                loop = false
            }
        }
    }
}