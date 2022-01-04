package leetcode._228

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val output = mutableListOf<String>()
        var inSummaryRange = false
        var startValue: Int? = null

        var index = 0
        while (index < nums.size) {
            if (inSummaryRange) {
                // Check whether the previous value is current value - 1
                if (nums[index - 1] != nums[index] - 1) {
                    // Check if the range has only one value
                    output.add(getSummaryRange(startValue, nums[index - 1]))
                    inSummaryRange = false
                } else {
                    index++
                }
            } else {
                startValue = nums[index]
                inSummaryRange = true
                index++
            }
        }

        if (inSummaryRange) {
            output.add(getSummaryRange(startValue, nums[nums.size - 1]))
            inSummaryRange = false
        }
        return output
    }

    private fun getSummaryRange(startValue: Int?, endValue: Int): String = if (startValue == endValue) {
        "$startValue"
    } else {
        "$startValue->$endValue"
    }
}