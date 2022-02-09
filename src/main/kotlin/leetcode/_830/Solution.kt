package leetcode._830

class Solution {
    fun largeGroupPositions(s: String): List<List<Int>> {
        var prevChar = s[0]
        var currentSize = 1
        var currentRangeStart = 0

        val output: MutableList<List<Int>> = mutableListOf()

        for (index in 1 until s.length) {
            val currentChar = s[index]

            if (prevChar == currentChar) {
                currentSize++
                if (index == s.length - 1) {
                    if (currentSize >= 3) {
                        output.add(listOf(currentRangeStart, currentRangeStart + currentSize - 1))
                    }
                }
            } else {
                if (currentSize >= 3) {
                    output.add(listOf(currentRangeStart, currentRangeStart + currentSize - 1))
                }
                currentSize = 1
                prevChar = currentChar
                currentRangeStart = index
            }
        }

        return output
    }
}