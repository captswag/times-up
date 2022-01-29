package leetcode._119

class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        return getPascalRow(rowIndex)
    }

    private fun getPascalRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) {
            return listOf(1)
        } else {
            val previousRow = getPascalRow(rowIndex - 1)
            val currentRow = mutableListOf<Int>()

            for (columnIndex in 0..rowIndex) {
                if (isFirstOrLast(rowIndex, columnIndex)) {
                    currentRow.add(1)
                } else {
                    currentRow.add(previousRow[columnIndex - 1] + previousRow[columnIndex])
                }
            }

            return currentRow
        }
    }

    private fun isFirstOrLast(rowIndex: Int, columnIndex: Int): Boolean = columnIndex == 0 || columnIndex == rowIndex
}