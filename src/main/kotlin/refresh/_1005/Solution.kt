package refresh._1005

class Solution {

    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
        nums.sort()
        var kValue = k
        var index = 0
        while (index < nums.size && nums[index] < 0 && kValue > 0) {
            nums[index++] *= -1
            kValue--
        }

        index = 0
        var min = nums[index]
        var sum = nums[index++]

        while (index < nums.size) {
            if (nums[index] < min) {
                min = nums[index]
            }
            sum += nums[index++]
        }

        return if (kValue and 1 == 1) {
            sum - (min * 2)
        } else {
            sum
        }
    }
}