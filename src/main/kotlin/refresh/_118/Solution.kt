package refresh._118

class Solution {

    fun generate(numRows: Int): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()

        for (i in 0 until numRows) {
            val row = MutableList(i + 1) { 0 }
            row[0] = 1
            row[row.size - 1] = 1
            for (j in 1 until row.size - 1) {
                row[j] = ans[i - 1][j - 1] + ans[i - 1][j]
            }
            ans.add(row)
        }

        return ans
    }
}