package leetcode._2506

class Solution {
    fun similarPairs(words: Array<String>): Int {
        var output = 0

        for (index0 in words.indices) {
            val countArray1 = createCountArray(words[index0])
            for (index1 in index0 + 1 until words.size) {
                val countArray2 = createCountArray(words[index1])
                if (isEqual(countArray1, countArray2)) {
                    output++
                }
            }
        }

        return output
    }

    private fun createCountArray(word: String): IntArray {
        val countArray = IntArray(26)
        for (char in word) {
            countArray[char - 'a']++
        }
        return countArray
    }

    private fun isEqual(countArray1: IntArray, countArray2: IntArray): Boolean {
        var similarPair = true
        for (index in 0 until 26) {
            if (!((countArray1[index] == 0 && countArray2[index] == 0) || (countArray1[index] > 0 && countArray2[index] > 0))) {
                similarPair = false
                break
            }
        }
        return similarPair
    }
}