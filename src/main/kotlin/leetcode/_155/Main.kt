package leetcode._155

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true

    val minStack = MinStack()

    while (loop) {
        print("1. Push\n2. Pop\n3. Top\n4. Min\nEnter your choice: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Enter the value to be pushed: ")
                minStack.push(scanner.nextInt())
            }
            2 -> {
                println("The popped value is: ${minStack.pop()}")
            }
            3 -> {
                println("The top value is ${minStack.top()}")
            }
            4 -> {
                println("The min value is ${minStack.getMin()}")
            }
            else -> {
                loop = false
                println("Exiting...")
            }
        }
    }
}