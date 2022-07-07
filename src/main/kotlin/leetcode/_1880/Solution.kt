package leetcode._1880

class Solution {
    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        val firstNumericalValue = getNumericalValue(firstWord)
        val secondNumericalValue = getNumericalValue(secondWord)
        val targetNumericalValue = getNumericalValue(targetWord)

        return firstNumericalValue + secondNumericalValue == targetNumericalValue
    }

    private fun getNumericalValue(word: String): Int {
        var numericalValue = word[0] - 'a'

        for (index in 1 until word.length) {
            numericalValue = numericalValue * 10 + (word[index] - 'a')
        }

        return numericalValue
    }
}