package refresh._2644

class Solution {

    fun maxDivScore(nums: IntArray, divisors: IntArray): Int {
        var ans = -1
        var mx = -1

        for (divisor in divisors) {
            var cnt = 0

            for (x in nums) {
                if (x % divisor == 0) {
                    cnt++
                }
            }

            if (cnt > mx) {
                mx = cnt
                ans = divisor
            } else if (cnt == mx && divisor < ans) {
                ans = divisor
            }
        }

        return ans
    }
}