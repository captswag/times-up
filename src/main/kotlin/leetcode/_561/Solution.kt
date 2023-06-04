package leetcode._561

class Solution {

    fun arrayPairSum(nums: IntArray): Int {
        var min = nums[0]
        var max = nums[0]

        for (index in 1 until nums.size) {
            min = Math.min(min, nums[index])
            max = Math.max(max, nums[index])
        }

        val countArray = IntArray(max - min + 1)
        for (num in nums) {
            countArray[num - min]++
        }

        var output = 0
        var isOddIndex = true
        for (index in countArray.indices) {
            while (countArray[index] > 0) {
                countArray[index]--
                if (isOddIndex) {
                    output += index + min
                }
                isOddIndex = !isOddIndex
            }
        }
        return output
    }
}