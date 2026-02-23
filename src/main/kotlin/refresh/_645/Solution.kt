package refresh._645

class Solution {

    fun findErrorNums(nums: IntArray): IntArray {
        val seen = mutableSetOf<Int>()
        val ans = IntArray(2)

        for (x in nums) {
            if (seen.contains(x)) {
                ans[0] = x
            } else {
                seen.add(x)
            }
        }

        for (v in 1..nums.size) {
            if (v !in seen) {
                ans[1] = v
            }
        }

        return ans
    }
}