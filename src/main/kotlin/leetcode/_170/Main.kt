package leetcode._170

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var loop = true
    val twoSum = TwoSum()

    while (loop) {
        print("1. Add\n2. Find sum pair\n3. Exit\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the value to insert: ")
                twoSum.add(scanner.nextInt())
            }
            2 -> {
                print("Enter the value to which you want to find the sum pair: ")
                val value = scanner.nextInt()
                val output = twoSum.find(value)
                if (output) {
                    println("There exists a pair of numbers whose sum is equal to $value")
                } else {
                    println("There is no pair in the list whose sum is equal to $value")
                }
            }
            3 -> {
                loop = false
                println("Exiting...")
            }
        }
    }
}