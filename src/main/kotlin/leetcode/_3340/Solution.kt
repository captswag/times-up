package leetcode._3340

class Solution {

    fun isBalanced(num: String): Boolean {
        var sum1 = 0
        var sum2 = 0

        for (i in num.indices) {
            if (i and 1 == 0) {
                sum1 += (num[i] - '0')
            } else {
                sum2 += (num[i] - '0')
            }
        }

        return sum1 == sum2
    }
}