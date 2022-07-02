package leetcode._2194

class Solution {
    fun cellsInRange(s: String): List<String> {
        val column1 = s[0].toInt()
        val row1 = s[1]
        val column2 = s[3].toInt()
        val row2 = s[4]
        val output = mutableListOf<String>()

        for (columnIndex in column1..column2) {
            for (rowIndex in row1..row2) {
                output.add("${columnIndex.toChar()}$rowIndex")
            }
        }

        return output
    }
}