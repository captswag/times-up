package refresh._2404

class Solution {

    fun mostFrequentEven(nums: IntArray): Int {
        val freq = mutableMapOf<Int, Int>()
        var ans = -1
        var mx = 0

        for (num in nums) {
            if (num and 1 == 0) {
                freq[num] = freq.getOrDefault(num, 0) + 1
                val cur = freq.getValue(num)
                if (cur == mx && num < ans) {
                    ans = num
                } else if (cur > mx) {
                    mx = cur
                    ans = num
                }
            }
        }

        return ans
    }
}