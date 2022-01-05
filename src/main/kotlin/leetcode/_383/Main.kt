package leetcode._383

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of ransomNote: ")
    val ransomNote = scanner.next()

    print("Enter the value of magazine: ")
    val magazine = scanner.next()

    val solution = Solution()
    val output = solution.canConstruct(ransomNote, magazine)

    if (output) {
        println("$ransomNote can be constructed from $magazine")
    } else {
        println("$ransomNote cannot be constructed from $magazine")
    }
}