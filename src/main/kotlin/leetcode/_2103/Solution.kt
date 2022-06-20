package leetcode._2103

class Solution {
    fun countPoints(rings: String): Int {
        val rArray = BooleanArray(10)
        val gArray = BooleanArray(10)
        val bArray = BooleanArray(10)

        for (index in rings.indices step 2) {
            val rod = Character.getNumericValue(rings[index + 1])
            if (rings[index] == 'R') {
                rArray[rod] = true
            } else if (rings[index] == 'G') {
                gArray[rod] = true
            } else {
                bArray[rod] = true
            }
        }

        var output = 0
        for (index in 0..9) {
            if (rArray[index] && gArray[index] && bArray[index]) {
                output++
            }
        }
        return output
    }
}