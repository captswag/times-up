package leetcode._2558

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val gifts = IntArray(size)
    for (index in gifts.indices) {
        print("Enter the value at index $index: ")
        gifts[index] = scanner.nextInt()
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.pickGifts(gifts, k)

    println("Number of gifts remaining after $k seconds is: $output")
}