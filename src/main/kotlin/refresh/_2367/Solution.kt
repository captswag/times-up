package refresh._2367

class Solution {

    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val seen = BooleanArray(201)

        for (num in nums) {
            seen[num] = true
        }

        var cnt = 0
        for (num in nums) {
            if (num + diff + diff < seen.size && seen[num + diff] && seen[num + diff + diff]) {
                cnt++
            }
        }

        return cnt
    }
}