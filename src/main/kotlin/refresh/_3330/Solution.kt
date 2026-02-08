package refresh._3330

class Solution {

    fun possibleStringCount(word: String): Int {
        var cnt = 1

        for (i in 0 until word.length - 1) {
            if (word[i] == word[i + 1]) {
                cnt++
            }
        }

        return cnt
    }
}