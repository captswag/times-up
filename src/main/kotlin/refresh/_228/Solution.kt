package refresh._228

class Solution {

    fun summaryRanges(nums: IntArray): List<String> {
        val res = mutableListOf<String>()

        var i = 0
        while (i < nums.size) {
            var j = i + 1
            while (j < nums.size && nums[j] - nums[j - 1] == 1) {
                j++
            }
            if (i == j - 1) {
                res.add("${nums[i]}")
            } else {
                res.add("${nums[i]}->${nums[j - 1]}")
            }
            i = j
        }

        return res
    }
}