package leetcode._2273

class Solution {

    fun removeAnagrams(words: Array<String>): List<String> {
        val output = mutableListOf<String>()
        var current = 0

        while (current < words.size) {
            var next = current + 1
            while (next < words.size && checkIfAnagram(words[current], words[next])) {
                next++
            }
            output.add(words[current])
            current = next
        }

        return output
    }

    private fun checkIfAnagram(word1: String, word2: String): Boolean {
        var anagram = true
        val charCountArray = IntArray(26)

        for (char in word1) {
            charCountArray[char - 'a']++
        }
        for (char in word2) {
            charCountArray[char - 'a']--
        }
        for (count in charCountArray) {
            if (count != 0) {
                anagram = false
                break
            }
        }
        return anagram
    }
}