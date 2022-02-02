package leetcode._1385

class Solution {
    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        // Sort the second array
        arr2.sort()
        var output = 0

        for (num in arr1) {
            val startRange = num - d
            val endRange = num + d

            var low = 0
            var high = arr2.size - 1

            var foundIndexInRange = false

            while (low <= high) {
                val mid = low + (high - low) / 2

                if (arr2[mid] in startRange..endRange) {
                    foundIndexInRange = true
                    break
                } else if (endRange < arr2[mid]) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            }

            if (!foundIndexInRange) {
                output++
            }
        }

        return output
    }
}