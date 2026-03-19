package refresh._2367

class Solution {

    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val seen = BooleanArray(201)
        var ans = 0

        for (x in nums) {
            if (x - diff >= 0 && x - diff - diff >= 0 && seen[x - diff] && seen[x - diff - diff]) {
                ans++
            }
            seen[x] = true
        }

        return ans
    }
}