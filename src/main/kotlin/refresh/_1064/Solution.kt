package refresh._1064

class Solution {

    fun fixedPoint(arr: IntArray): Int {
        var low = 0
        var high = arr.size - 1
        var point = -1

        while (low <= high) {
            val mid = (low + high) ushr 1
            if (arr[mid] == mid) {
                point = mid
                high = mid - 1
            } else if (arr[mid] < mid) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return point
    }
}