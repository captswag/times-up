package leetcode._27

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var output = 0

        var first = 0
        var last = nums.size - 1

        while (first <= last) {
            if (nums[first] == `val`) {
                val temp = nums[first]
                nums[first] = nums[last]
                nums[last] = temp
                last--
            } else {
                first++
                output++
            }
        }

        return output
    }
}