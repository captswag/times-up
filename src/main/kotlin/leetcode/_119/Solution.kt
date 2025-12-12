package leetcode._119

class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val currRow = MutableList(rowIndex + 1) { 1 }
        var currRowIndex = 1

        return if (currRowIndex < currRow.size - 1) {
            val prevRow = getRow(rowIndex - 1)
            var prevRowIndex = 0
            while (currRowIndex < currRow.size - 1) {
                currRow[currRowIndex] = prevRow[prevRowIndex] + prevRow[prevRowIndex + 1]
                currRowIndex++
                prevRowIndex++
            }
            currRow
        } else {
            currRow
        }
    }
}