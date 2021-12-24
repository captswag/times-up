package basics.arrays.binarysearch

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        nums[index] = scanner.nextInt()
    }

    print("Enter the value to be searched: ")
    val x = scanner.nextInt()

    val solution = Solution()
    val output = solution.performBinarySearch(nums, x)

    println("The index of $x is: $output")
}