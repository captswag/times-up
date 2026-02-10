package refresh._1

class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        val ans = IntArray(2)
        var i = 0

        while (target - nums[i] !in map.keys) {
            map[nums[i]] = i
            i++
        }

        ans[0] = map.getValue(target - nums[i])
        ans[1] = i

        return ans
    }
}