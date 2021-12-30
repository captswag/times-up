package leetcode._345

class Solution {
    fun reverseVowels(s: String): String {
        val set = hashSetOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        val charArray = s.toCharArray()
        var startIndex = 0
        var endIndex = charArray.size - 1

        while (startIndex < endIndex) {
            if (set.contains(charArray[startIndex])) {
                // Check if the endIndex is also a vowel, if yes swap, otherwise decrement endIndex
                if (set.contains(charArray[endIndex])) {
                    // Both startIndex and endIndex are vowels
                    val temp = charArray[startIndex]
                    charArray[startIndex] = charArray[endIndex]
                    charArray[endIndex] = temp

                    startIndex++
                    endIndex--
                } else {
                    endIndex--
                }
            } else {
                startIndex++
            }
        }

        return String(charArray)
    }
}