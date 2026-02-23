package refresh._119

class Solution {

    fun getRow(rowIndex: Int): List<Int> {
        var ans = mutableListOf(1)

        for (i in 1..rowIndex) {
            val row = MutableList(i + 1) { 0 }
            row[0] = 1
            row[row.size - 1] = 1

            for (j in 1 until row.size - 1) {
                row[j] = ans[j - 1] + ans[j]
            }

            ans = row
        }

        return ans
    }
}