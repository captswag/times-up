package refresh._496

import java.util.*

class Solution {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val stk = Stack<Int>()
        val mp = mutableMapOf<Int, Int>()

        for (x in nums2) {
            while (stk.isNotEmpty() && stk.peek() < x) {
                mp[stk.pop()] = x
            }
            stk.push(x)
        }

        while (stk.isNotEmpty()) {
            mp[stk.pop()] = -1
        }

        for (i in nums1.indices) {
            nums1[i] = mp.getValue(nums1[i])
        }

        return nums1
    }
}