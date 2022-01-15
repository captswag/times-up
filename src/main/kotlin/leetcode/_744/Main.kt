package leetcode._744

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the CharArray: ")
    val size = scanner.nextInt()

    val letters = CharArray(size)
    for (index in letters.indices) {
        print("Enter the character at index $index: ")
        letters[index] = scanner.next()[0]
    }

    print("Enter the target value: ")
    val target = scanner.next()[0]

    val solution = Solution()
    val output = solution.nextGreatestLetter(letters, target)

    println("The next greater element is: $output")
}