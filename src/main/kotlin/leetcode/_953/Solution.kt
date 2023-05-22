package leetcode._953

class Solution {

    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val charWeightArray = IntArray(26)
        for (index in order.indices) {
            charWeightArray[order[index] - 'a'] = index
        }

        var output = true

        outer@ for (next in 1 until words.size) {
            val word1 = words[next - 1]
            val word2 = words[next]

            for (index in word1.indices) {
                val char1Weight = charWeightArray[word1[index] - 'a']
                val char2Weight = if (index < word2.length) {
                    charWeightArray[word2[index] - 'a']
                } else {
                    -1
                }

                if (char1Weight < char2Weight) {
                    break
                } else if (char1Weight == char2Weight) {
                    continue
                } else {
                    output = false
                    break@outer
                }
            }
        }

        return output
    }
}