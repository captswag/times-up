package leetcode._1812

class Solution {
    fun squareIsWhite(coordinates: String): Boolean {
        val columnArray = intArrayOf(0, 1, 0, 1, 0, 1, 0, 1)

        val column = coordinates[0] - 'a'
        val row = Character.getNumericValue(coordinates[1])

        // In the column array, if the value starts with black, means all odd indexes are black and vice versa
        val blackOrWhite = columnArray[column]
        val output = if (blackOrWhite == 0) {
            row % 2 == 0
        } else {
            row % 2 != 0
        }

        return output
    }
}