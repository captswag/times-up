package refresh._1228

class Solution {

    fun missingNumber(arr: IntArray): Int {
        var index = 0
        var minDiff = Math.abs(arr[index] - arr[index + 1])
        val isAscending = arr[index] < arr[index + 1]
        index++

        while (index < arr.size - 1) {
            val currDiff = Math.abs(arr[index] - arr[index + 1])
            if (currDiff < minDiff) {
                minDiff = currDiff
            }
            index++
        }

        index = 0
        while (index < arr.size - 1) {
            val currDiff = Math.abs(arr[index] - arr[index + 1])
            if (currDiff != minDiff) {
                return if (isAscending) {
                    arr[index] + minDiff
                } else {
                    arr[index] - minDiff
                }
            }
            index++
        }

        return arr[0]
    }
}