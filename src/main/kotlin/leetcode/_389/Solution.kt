package leetcode._389

class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var diff = 0

        var index = 0
        while (index < s.length) {
            diff = diff xor s[index].toInt() xor t[index].toInt()
            index++
        }
        diff = diff xor t[index].toInt()

        return diff.toChar()
    }
}