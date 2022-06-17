package leetcode._2278

class Solution {
    fun percentageLetter(s: String, letter: Char): Int {
        var letterCount = 0

        for (c in s) {
            if (c == letter) {
                letterCount++
            }
        }

        return (letterCount * 100) / s.length
    }
}