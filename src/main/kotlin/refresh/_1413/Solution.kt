package refresh._1413

class Solution {

    fun minStartValue(nums: IntArray): Int {
        var index = 0
        var runningSum = nums[index]
        var minPrefixSum = runningSum
        index++

        while (index < nums.size) {
            runningSum += nums[index]
            if (runningSum < minPrefixSum) {
                minPrefixSum = runningSum
            }
            index++
        }

        return if (minPrefixSum < 0) {
            1 - minPrefixSum
        } else {
            1
        }
    }
}