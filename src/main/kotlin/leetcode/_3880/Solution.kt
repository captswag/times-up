package leetcode._3880

import kotlin.math.min

class Solution {

    fun minAbsoluteDifference(nums: IntArray): Int {
        var lst1 = -1
        var lst2 = -1
        var mn = 101

        for (i in nums.indices) {
            if (nums[i] == 1) {
                lst1 = i
                if (lst2 != -1) {
                    mn = min(mn, lst1 - lst2)
                }
            } else if (nums[i] == 2) {
                lst2 = i
                if (lst1 != -1) {
                    mn = min(mn, lst2 - lst1)
                }
            }
        }

        return if (mn == 101) {
            -1
        } else {
            mn
        }
    }
}