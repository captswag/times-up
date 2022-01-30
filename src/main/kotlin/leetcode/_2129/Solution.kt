package leetcode._2129

class Solution {
    fun capitalizeTitle(title: String): String {
        val charArray = title.toCharArray()

        var count = 0
        var startIndex = 0
        for (index in 0..charArray.size) {
            if (index == charArray.size || title[index] == ' ') {
                if (count > 2) {
                    // Then we have to uppercase the value at startIndex
                    charArray[startIndex] = charArray[startIndex].toUpperCase()
                }
                startIndex = index + 1
                count = 0
            } else {
                charArray[index] = charArray[index].toLowerCase()
                count++
            }
        }

        return String(charArray)
    }
}