package refresh._2248

class Solution {

    fun intersection(nums: Array<IntArray>): List<Int> {
        val frequency = IntArray(1001)

        for (num in nums) {
            for (n in num) {
                frequency[n]++
            }
        }

        val res = mutableListOf<Int>()
        for (i in frequency.indices) {
            if (frequency[i] == nums.size) {
                res.add(i)
            }
        }

        return res
    }
}