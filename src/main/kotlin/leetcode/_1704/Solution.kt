package leetcode._1704

class Solution {
    fun halvesAreAlike(s: String): Boolean {
        val vowelSet = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val halfLength = s.length / 2
        var startIndex = 0
        var endIndex = s.length - 1

        var vowelCount1 = 0
        var vowelCount2 = 0
        while (startIndex < halfLength) {
            if (vowelSet.contains(s[startIndex])) {
                vowelCount1++
            }
            startIndex++
            if (vowelSet.contains(s[endIndex])) {
                vowelCount2++
            }
            endIndex--
        }
        return vowelCount1 == vowelCount2
    }
}