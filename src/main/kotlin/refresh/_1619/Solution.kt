package refresh._1619

class Solution {

    fun trimMean(arr: IntArray): Double {
        arr.sort()
        val skip = arr.size / 20
        var sum = 0.0
        for (index in skip until arr.size - skip) {
            sum += arr[index]
        }

        return sum / (arr.size - (skip * 2))
    }
}