package leetcode._232

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true

    val queue = MyQueue()

    while (loop) {
        print("1. Push\n2. Pop\n3. Peek\n4. Empty\nEnter your choice: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Enter the value to be pushed: ")
                queue.push(scanner.nextInt())
            }
            2 -> {
                println("The value that is popped is: ${queue.pop()}")
            }
            3 -> {
                println("The value at the top is ${queue.peek()}")
            }
            4 -> {
                val output = queue.empty()
                if (output) {
                    println("The queue is empty")
                } else {
                    println("The queue is not empty")
                }
            }
            else -> {
                loop = false
                println("Exiting...")
            }
        }
    }
}