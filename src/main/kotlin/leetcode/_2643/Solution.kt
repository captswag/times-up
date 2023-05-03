package leetcode._2643

class Solution {

    fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
        var minRow = 0
        var maxCount = 0

        for (rowIndex in mat.indices) {
            var currentCount = 0
            for (columnIndex in mat[0].indices) {
                currentCount += mat[rowIndex][columnIndex]
            }

            if (currentCount > maxCount) {
                maxCount = currentCount
                minRow = rowIndex
            }
        }

        return intArrayOf(minRow, maxCount)
    }
}