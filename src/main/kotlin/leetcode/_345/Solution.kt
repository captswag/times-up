package leetcode._345

class Solution {
    fun reverseVowels(s: String): String {
        val set = hashSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val charArray = s.toCharArray()
        var start = 0
        var end = charArray.size - 1

        while (start < end) {
            while (start < charArray.size && charArray[start] !in set) {
                start++
            }
            while (end >= 0 && charArray[end] !in set) {
                end--
            }
            if (start < end) {
                val temp = charArray[end]
                charArray[end] = charArray[start]
                charArray[start] = temp
                start++
                end--
            }
        }

        return String(charArray)
    }
}