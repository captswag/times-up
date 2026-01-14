package refresh._1880

class Solution {

    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        val first = calculateNumericalValue(firstWord)
        val second = calculateNumericalValue(secondWord)
        val target = calculateNumericalValue(targetWord)
        return (first + second == target)
    }

    private fun calculateNumericalValue(word: String): Int {
        var numericalValue = 0
        var placeValue = 1
        for (i in word.length - 1 downTo 0) {
            numericalValue += ((word[i] - 'a') * placeValue)
            placeValue *= 10
        }
        return numericalValue
    }
}