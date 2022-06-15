package leetcode._2283

class Solution {
    fun digitCount(num: String): Boolean {
        val countArray = IntArray(10)

        for (c in num) {
            val digit = Character.getNumericValue(c) // Now we got the int value
            countArray[digit] = countArray[digit] + 1
        }

        var output = true
        for (index in num.indices) {
            val count = countArray[index]
            if (count != Character.getNumericValue(num[index])) {
                output = false
                break
            }
        }

        return output
    }
}