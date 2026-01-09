package refresh._1380

class Solution {

    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val luckyNumbers = mutableListOf<Int>()

        for (i in matrix.indices) {
            var min = 100001
            var minIndex = -1
            for (j in matrix[0].indices) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j]
                    minIndex = j
                }
            }

            var k = 0
            while (k < matrix.size) {
                if (min < matrix[k][minIndex]) {
                    break
                }
                k++
            }

            if (k == matrix.size) {
                luckyNumbers.add(min)
            }
        }

        return luckyNumbers
    }
}