package leetcode._118

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        return getPascalRows(numRows - 1)
    }

    private fun getPascalRows(numRows: Int): MutableList<List<Int>> {
        if (numRows == 0) {
            return mutableListOf(listOf(1))
        } else {
            val currentList = getPascalRows(numRows - 1)
            // If the current row is 10, that means currentList is filled till 9
            val currentRow = mutableListOf<Int>()
            for (columnIndex in 0..numRows) {
                if (isFirstOrLast(numRows, columnIndex)) {
                    currentRow.add(1)
                } else {
                    currentRow.add(
                        currentList[numRows - 1][columnIndex - 1] + currentList[numRows - 1][columnIndex]
                    )
                }
            }
            currentList.add(currentRow)
            return currentList
        }
    }

    private fun isFirstOrLast(rowIndex: Int, columnIndex: Int) = columnIndex == 0 || columnIndex == rowIndex
}