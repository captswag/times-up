package refresh._1

class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mp = mutableMapOf<Int, Int>()
        val ans = IntArray(2)
        var i = 0

        while (target - nums[i] !in mp.keys) {
            mp[nums[i]] = i
            i++
        }

        ans[0] = mp.getValue(target - nums[i])
        ans[1] = i

        return ans
    }
}