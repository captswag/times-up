package leetcode._303

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    var loop = true

    val numArray = NumArray(nums)

    while (loop) {
        print("1. Range sum\n2. Exit\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the left index: ")
                val left = scanner.nextInt()
                print("Enter the right index: ")
                val right = scanner.nextInt()
                val output = numArray.sumRange(left, right)
                println("The range sum between the indices $left and $right is: $output")
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