package leetcode._925

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the name: ")
    val name = scanner.next()

    print("Enter the typed name: ")
    val typed = scanner.next()

    val solution = Solution()
    val output = solution.isLongPressedName(name, typed)

    if (output) {
        println("The typed name is the same as the name $name")
    } else {
        println("The typed name is not same as the name $name")
    }
}