package leetcode._2855

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the nums list: ")
    val size = scanner.nextInt()

    var nums = mutableListOf<Int>()
    for (index in 0 until size) {
        print("Enter the value at index $index: ")
        nums.add(scanner.nextInt())
    }

    val solution = Solution()
    val output = solution.minimumRightShifts(nums)

    println("The minimum right shifts to sort the array is $output")
}