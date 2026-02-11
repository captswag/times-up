package refresh._3731

class Solution {

    fun findMissingElements(nums: IntArray): List<Int> {
        var i = 0
        var mn = nums[i]
        var mx = nums[i]
        val seen = BooleanArray(101)
        seen[nums[i]] = true
        i++

        while (i < nums.size) {
            if (nums[i] > mx) {
                mx = nums[i]
            } else if (nums[i] < mn) {
                mn = nums[i]
            }
            seen[nums[i]] = true
            i++
        }

        val ans = mutableListOf<Int>()
        for (num in mn..mx) {
            if (!seen[num]) {
                ans.add(num)
            }
        }

        return ans
    }
}