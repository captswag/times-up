package leetcode._3074

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the first array: ")
    val size1 = scanner.nextInt()

    val apple = IntArray(size1)
    for (index in apple.indices) {
        print("Enter the value at index $index: ")
        apple[index] = scanner.nextInt()
    }

    print("Enter the size of the second array: ")
    val size2 = scanner.nextInt()

    val capacity = IntArray(size2)
    for (index in capacity.indices) {
        print("Enter the value at index $index: ")
        capacity[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.minimumBoxes(apple, capacity)

    println("Required number of boxes is $output")
}