package basics.arrays.binarysearch

class Solution {
    // Returns the index of the searched element. If element not found, returns -1
    fun performBinarySearch(nums: IntArray, x: Int): Int {
        var low = 0
        var high = nums.size - 1
        var searchIndex = -1

        while (low < high) {
            val mid = (low + high) / 2

            if (nums[mid] == x) {
                searchIndex = mid
                break
            } else if (x < nums[mid]) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return searchIndex
    }
}