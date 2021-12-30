package leetcode._1119

class Solution {
    fun removeVowels(s: String): String {
        val set = hashSetOf('a', 'e', 'i', 'o', 'u')
        val sb = StringBuilder()

        for (char in s) {
            if (!set.contains(char)) {
                sb.append(char)
            }
        }

        return sb.toString()
    }
}