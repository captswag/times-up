package leetcode._359

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true
    val logger = Logger()

    while (loop) {
        print("1. shouldPrintMessage()\n2. Exit]\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the timestamp: ")
                val timestamp = scanner.nextInt()
                print("Enter the message: ")
                val message = scanner.next()
                val output = logger.shouldPrintMessage(timestamp, message)
                println("Output: $output")
            }
            2 -> {
                print("Exiting...")
                loop = false
            }
            3 -> {
                print("Exiting...")
                loop = false
            }
        }
    }
}