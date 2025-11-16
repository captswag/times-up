package leetcode._3668

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the order array: ")
    val orderSize = scanner.nextInt()

    val order = IntArray(orderSize)
    for (index in order.indices) {
        print("Enter the value at index $index: ")
        order[index] = scanner.nextInt()
    }

    print("Enter the size of the friends array: ")
    val friendsSize = scanner.nextInt()

    val friends = IntArray(friendsSize)
    for (index in friends.indices) {
        print("Enter the value at index $index: ")
        friends[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.recoverOrder(order, friends)

    output.displayFormatted()
}