package refresh._2363

class Solution {

    fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
        val weightArray = IntArray(1001)

        for (item in items1) {
            weightArray[item[0]] = item[1]
        }

        for (item in items2) {
            weightArray[item[0]] += item[1]
        }

        val res = mutableListOf<List<Int>>()
        for (i in weightArray.indices) {
            if (weightArray[i] > 0) {
                res.add(listOf(i, weightArray[i]))
            }
        }

        return res
    }
}