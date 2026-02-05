package refresh._2942

class Solution {

    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val ans = mutableListOf<Int>()

        for (i in words.indices) {
            for (j in words[i].indices) {
                if (words[i][j] == x) {
                    ans.add(i)
                    break
                }
            }
        }

        return ans
    }
}