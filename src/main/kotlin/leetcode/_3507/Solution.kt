package leetcode._3507

class Solution {

    fun minimumPairRemoval(nums: IntArray): Int {
        var removalCount = 0
        var currentSize = nums.size

        while (true) {
            if (isSorted(nums, currentSize)) {
                break
            } else {
                var leftIndexOfMinPair = 0
                var rightIndexOfMinPair = 1
                var minPairSum = nums[leftIndexOfMinPair] + nums[rightIndexOfMinPair]

                for (i in 1 until currentSize - 1) {
                    val pairSum = nums[i] + nums[i + 1]
                    if (pairSum < minPairSum) {
                        minPairSum = pairSum
                        leftIndexOfMinPair = i
                        rightIndexOfMinPair = i + 1
                    }
                }

                nums[leftIndexOfMinPair] = minPairSum
                for (i in rightIndexOfMinPair until currentSize - 1) {
                    nums[i] = nums[i + 1]
                }
                currentSize--
                removalCount++
            }
        }

        return removalCount
    }

    private fun isSorted(nums: IntArray, currentSize: Int): Boolean {
        for (i in 0 until currentSize - 1) {
            if (nums[i] > nums[i + 1]) {
                return false
            }
        }

        return true
    }
}