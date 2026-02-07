package refresh._448

class Solution {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val seen = mutableSetOf<Int>()

        for (num in nums) {
            seen.add(num)
        }

        val ans = mutableListOf<Int>()
        for (x in 1..nums.size) {
            if (x !in seen) {
                ans.add(x)
            }
        }

        return ans
    }
}