package leetcode._1252

class Solution {
    fun oddCells(m: Int, n: Int, indices: Array<IntArray>): Int {
        val arr = Array(m) { IntArray(n) }

        for (index in indices.indices) {
            var rowIndex = indices[index][0]
            var columnIndex = 0
            while (columnIndex < arr[rowIndex].size) {
                arr[rowIndex][columnIndex]++
                columnIndex++
            }

            rowIndex = 0
            columnIndex = indices[index][1]
            while (rowIndex < arr.size) {
                arr[rowIndex][columnIndex]++
                rowIndex++
            }
        }

        var output = 0
        for (rowIndex in arr.indices) {
            for (columnIndex in arr[rowIndex].indices) {
                if (arr[rowIndex][columnIndex] % 2 == 1) {
                    output++
                }
            }
        }

        return output
    }
}