package refresh._3232

class Solution {

    fun canAliceWin(nums: IntArray): Boolean {
        var sum1 = 0
        var sum2 = 0

        for (num in nums) {
            if (num < 10) {
                sum1 += num
            } else {
                sum2 += num
            }
        }

        return sum1 != sum2
    }
}