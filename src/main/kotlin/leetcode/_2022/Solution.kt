package leetcode._2022

class Solution {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        return if (original.size == m * n) {
            val output = Array(m) { IntArray(n) }
            var originalIndex = 0
            for (rowIndex in output.indices) {
                for (columnIndex in output[rowIndex].indices) {
                    if (originalIndex < original.size) {
                        output[rowIndex][columnIndex] = original[originalIndex++]
                    } else {
                        break
                    }
                }
            }
            output
        } else {
            Array(0) { intArrayOf() }
        }
    }
}