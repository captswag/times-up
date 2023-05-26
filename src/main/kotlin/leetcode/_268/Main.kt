package leetcode._268

import leetcode._268.xor.SolutionXor
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

    val solution: Solution = SolutionXor()
    val output = solution.missingNumber(nums)

    println("The missing number is: $output")
}