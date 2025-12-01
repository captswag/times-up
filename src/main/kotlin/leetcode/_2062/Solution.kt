package leetcode._2062

class Solution {

    fun countVowelSubstrings(word: String): Int {
        var pos: Int
        var index = 0
        var count = 0
        val vowels = setOf('a', 'e', 'i', 'o', 'u')

        while (index < word.length) {
            while (index < word.length && word[index] !in vowels) {
                index++
            }
            pos = index

            val map = mutableMapOf<Char, Int>()
            while (index < word.length && word[index] in vowels) {
                map[word[index]] = map.getOrDefault(word[index], 0) + 1
                index++
                if (map.size == 5) {
                    count++
                }
            }

            index = pos + 1
        }

        return count
    }
}