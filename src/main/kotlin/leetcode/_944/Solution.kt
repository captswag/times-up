package leetcode._944

class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        val strsLength = strs[0].length
        var output = 0

        for (columnIndex in 0 until strsLength) {
            var rowIndex = 0
            while (rowIndex + 1 < strs.size) {
                if (strs[rowIndex + 1][columnIndex] < strs[rowIndex][columnIndex]) {
                    output++
                    break
                }
                rowIndex++
            }
        }

        return output
    }
}