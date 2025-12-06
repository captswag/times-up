package leetcode._345

class Solution {
    fun reverseVowels(s: String): String {
        val chars = s.toCharArray()
        val vowels = mutableSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var left = 0
        var right = chars.size - 1

        while (left < right) {
            if (chars[left] in vowels && chars[right] in vowels) {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
                left++
                right--
            } else if (chars[left] in vowels) {
                right--
            } else if (chars[right] in vowels) {
                left++
            } else {
                left++
                right--
            }
        }

        return String(chars)
    }
}