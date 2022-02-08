package leetcode._1773

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val items = mutableListOf<List<String>>()
    for (index in 0 until size) {
        println("Index: $index")
        print("Enter the type: ")
        val type = scanner.next()
        print("Enter the color: ")
        val color = scanner.next()
        print("Enter the name: ")
        val name = scanner.next()
        val item = listOf(type, color, name)
        items.add(item)
    }

    print("Enter the ruleKey: ")
    val ruleKey = scanner.next()

    print("Enter the ruleValue: ")
    val ruleValue = scanner.next()

    val solution = Solution()
    val output = solution.countMatches(items, ruleKey, ruleValue)

    println("The number of items matching the given rule is: $output")
}