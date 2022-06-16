package leetcode._2206

class Solution {
    fun divideArray(nums: IntArray): Boolean {
        val countArray = IntArray(500)

        for (num in nums) {
            countArray[num - 1] = countArray[num - 1] + 1
        }

        var output = true
        for (count in countArray) {
            if (count % 2 == 1) {
                output = false
                break
            }
        }

        return output
    }
}