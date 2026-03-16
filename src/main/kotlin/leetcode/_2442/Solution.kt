package leetcode._2442

class Solution {

    fun countDistinctIntegers(nums: IntArray): Int {
        val st = mutableSetOf<Int>()

        for (x in nums) {
            st.add(x)
            st.add(rev(x))
        }

        return st.size
    }

    private fun rev(num: Int): Int {
        var x = num
        var res = 0

        while (x > 0) {
            res = (res * 10) + (x % 10)
            x /= 10
        }

        return res
    }
}