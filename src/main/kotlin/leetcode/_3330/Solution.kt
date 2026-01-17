package leetcode._3330

class Solution {

    fun possibleStringCount(word: String): Int {
        var count = 1
        var i = 0

        while (i < word.length) {
            var j = i
            while (j < word.length && word[j] == word[i]) {
                j++
            }
            count += (j - i - 1)
            i = j
        }

        return count
    }
}