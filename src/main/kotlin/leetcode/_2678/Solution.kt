package leetcode._2678

class Solution {
    fun countSeniors(details: Array<String>): Int {
        var count = 0

        for (detail in details) {
            val age = Character.getNumericValue(detail[11]) * 10 + Character.getNumericValue(detail[12])
            if (age > 60) {
                count++
            }
        }

        return count
    }
}