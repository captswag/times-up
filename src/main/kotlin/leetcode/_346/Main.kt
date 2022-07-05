package leetcode._346

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true

    print("Enter size: ")
    val movingAverage = MovingAverage(scanner.nextInt())

    while (loop) {
        print("1. next()\n2. Exit\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the next value: ")
                val output = movingAverage.next(scanner.nextInt())
                println("The moving average is: $output")
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