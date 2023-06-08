package leetcode._2389

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the nums array: ")
    val numsSize = scanner.nextInt()

    val nums = IntArray(numsSize)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    print("Enter the size of the queries array: ")
    val queriesSize = scanner.nextInt()

    val queries = IntArray(queriesSize)
    for (index in queries.indices) {
        print("Enter the value at index $index: ")
        queries[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.answerQueries(nums, queries)

    output.displayFormatted()
}