package leetcode._225

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true

    val stack = MyStack()

    while (loop) {
        print("1. Push\n2. Pop\n3. Top\n4. Empty\nEnter your choice: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Enter the number to be pushed: ")
                stack.push(scanner.nextInt())
            }
            2 -> {
                println("The number that is popped is: ${stack.pop()}")
            }
            3 -> {
                println("The number that is at top is ${stack.top()}")
            }
            4 -> {
                val output = stack.empty()
                if (output) {
                    println("The stack is empty")
                } else {
                    println("The stack is not empty")
                }
            }
            else -> {
                loop = false
                println("Exiting...")
            }
        }
    }
}