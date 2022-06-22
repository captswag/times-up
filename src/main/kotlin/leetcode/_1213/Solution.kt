package leetcode._1213

class Solution {
    fun arraysIntersection(arr1: IntArray, arr2: IntArray, arr3: IntArray): List<Int> {
        val output = mutableListOf<Int>()
        for (num in arr1) {
            val found = findK(arr2, num)
            if (findK(arr3, num)) {
                if (found) {
                    output.add(num)
                }
            }
        }
        return output
    }

    private fun findK(arr: IntArray, k: Int): Boolean {
        var found = false
        var low = 0
        var high = arr.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2
            if (arr[mid] == k) {
                found = true
                break
            } else if (arr[mid] < k) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return found
    }
}