package leetcode._228

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val summaryRanges = mutableListOf<String>()

        if (nums.isNotEmpty()) {
            var index = 0
            var start = nums[index++]

            while (index < nums.size) {
                if (nums[index] != nums[index - 1] + 1) {
                    summaryRanges.add(getSummaryRange(start, nums[index - 1]))
                    start = nums[index]
                }
                index++
            }

            summaryRanges.add(getSummaryRange(start, nums[nums.size - 1]))
        }

        return summaryRanges
    }

    private fun getSummaryRange(start: Int, end: Int): String {
        return if (start == end) {
            "$start"
        } else {
            "$start->$end"
        }
    }
}