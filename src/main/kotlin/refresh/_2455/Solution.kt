package refresh._2455

class Solution {

    fun averageValue(nums: IntArray): Int {
        var sum = 0
        var cnt = 0

        for (num in nums) {
            if (num and 1 == 0 && num % 3 == 0) {
                sum += num
                cnt++
            }
        }

        return if (cnt == 0) {
            0
        } else {
            sum / cnt
        }
    }
}