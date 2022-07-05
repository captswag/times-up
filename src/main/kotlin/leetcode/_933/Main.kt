package leetcode._933

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true
    val recentCounter = RecentCounter()

    while (loop) {
        print("1. ping()\n2. Exit\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter time: ")
                val output = recentCounter.ping(scanner.nextInt())
                println("The number of recent requests within the given time frame is: $output")
            }
            2 -> {
                println("Exiting...")
                loop = false
            }
            else -> {
                println("Exiting...")
                loop = false
            }
        }
    }
}