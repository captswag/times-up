package refresh._2533

class Solution {

    fun separateDigits(nums: IntArray): IntArray {
        val res = mutableListOf<Int>()

        for (i in nums.size - 1 downTo 0) {
            var x = nums[i]
            while (x != 0) {
                res.add(x % 10)
                x /= 10
            }
        }

        res.reverse()
        return res.toIntArray()
    }
}