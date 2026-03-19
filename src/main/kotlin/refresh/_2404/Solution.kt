package refresh._2404

class Solution {

    fun mostFrequentEven(nums: IntArray): Int {
        val cnt = mutableMapOf<Int, Int>()
        var ans = -1

        for (x in nums) {
            if (x and 1 == 0) {
                cnt[x] = cnt.getOrDefault(x, 0) + 1
                if (ans == -1 || cnt.getValue(x) > cnt.getValue(ans) || (cnt.getValue(x) == cnt.getValue(ans) && x < ans)) {
                    ans = x
                }
            }
        }

        return ans
    }
}