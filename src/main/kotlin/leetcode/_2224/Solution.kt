package leetcode._2224

class Solution {
    fun convertTime(current: String, correct: String): Int {
        val currentHour = (Character.getNumericValue(current[0]) * 10) + Character.getNumericValue(current[1])
        val currentMinute = (Character.getNumericValue(current[3]) * 10) + Character.getNumericValue(current[4])

        val correctHour = (Character.getNumericValue(correct[0]) * 10) + Character.getNumericValue(correct[1])
        val correctMinute = (Character.getNumericValue(correct[3]) * 10) + Character.getNumericValue(correct[4])

        var currentCombined = currentHour * 60 + currentMinute
        val correctCombined = correctHour * 60 + correctMinute

        var output = 0

        while (currentCombined + 60 <= correctCombined) {
            currentCombined += 60
            output++
        }
        while (currentCombined + 15 <= correctCombined) {
            currentCombined += 15
            output++
        }
        while (currentCombined + 5 <= correctCombined) {
            currentCombined += 5
            output++
        }
        while (currentCombined + 1 <= correctCombined) {
            currentCombined += 1
            output++
        }

        return output
    }
}