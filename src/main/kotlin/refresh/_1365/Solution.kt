package refresh._1365

class Solution {

    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val frequency = IntArray(101)

        for (num in nums) {
            frequency[num]++
        }

        for (index in 1 until frequency.size) {
            frequency[index] = frequency[index] + frequency[index - 1]
        }

        for (index in nums.indices) {
            if (nums[index] == 0) {
                nums[index] = 0
            } else {
                nums[index] = frequency[nums[index] - 1]
            }
        }

        return nums
    }
}