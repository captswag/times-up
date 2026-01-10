package refresh._1331

class Solution {

    fun arrayRankTransform(arr: IntArray): IntArray {
        val arrSorted = arr.sortedArray()

        val map = mutableMapOf<Int, Int>()
        var rank = 1

        for (num in arrSorted) {
            if (!map.containsKey(num)) {
                map[num] = rank++
            }
        }

        for (index in arr.indices) {
            arr[index] = map.getValue(arr[index])
        }

        return arr
    }
}