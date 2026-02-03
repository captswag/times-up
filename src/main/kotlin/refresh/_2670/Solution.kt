package refresh._2670

class Solution {

    fun distinctDifferenceArray(nums: IntArray): IntArray {
        var i = 0
        val prefixMap = mutableMapOf(nums[i] to 1)
        i++
        val suffixMap = mutableMapOf<Int, Int>()
        while (i < nums.size) {
            suffixMap[nums[i]] = suffixMap.getOrDefault(nums[i], 0) + 1
            i++
        }

        val ans = IntArray(nums.size)
        i = 0
        ans[i] = prefixMap.size - suffixMap.size
        i++

        while (i < nums.size) {
            prefixMap[nums[i]] = prefixMap.getOrDefault(nums[i], 0) + 1
            if (suffixMap.getValue(nums[i]) == 1) {
                suffixMap.remove(nums[i])
            } else {
                suffixMap[nums[i]] = suffixMap.getValue(nums[i]) - 1
            }
            ans[i] = prefixMap.size - suffixMap.size
            i++
        }

        return ans
    }
}