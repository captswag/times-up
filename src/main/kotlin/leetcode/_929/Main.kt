package leetcode._929

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the email array: ")
    val size = scanner.nextInt()

    val emails = Array(size) { "" }
    for (index in emails.indices) {
        print("Enter the email at index $index: ")
        emails[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.numUniqueEmails(emails)

    println("The number of unique email addresses is: $output")
}