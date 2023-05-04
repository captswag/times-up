package basics.arrays.binarysearch

class Solution {
    // Returns the index of the searched element. If element not found, returns -1
    fun performBinarySearch(nums: IntArray, x: Int): Int {
        var low = 0
        var high = nums.size - 1
        var searchIndex = -1

        while (low <= high) {
            /**
             * https://ai.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html
             * mid =(low + high) / 2
             * On the face of it, this assertion might appear correct, but it fails for large values of the int
             * variables low and high. Specifically, it fails if the sum of low and high is greater than the maximum
             * positive int value (231 - 1). The sum overflows to a negative value, and the value stays negative when
             * divided by two. In C this causes an array index out of bounds with unpredictable results. In Java, it
             * throws ArrayIndexOutOfBoundsException.
             */
            val mid = (low + high) ushr 1 // Could also use low + ((high - low) / 2)

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