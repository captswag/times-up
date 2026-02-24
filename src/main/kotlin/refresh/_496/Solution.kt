package refresh._496

import java.util.*

class Solution {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val st = Stack<Int>()
        val mp = mutableMapOf<Int, Int>()

        for (x in nums2) {
            if (st.isEmpty()) {
                st.push(x)
            } else {
                while (st.isNotEmpty() && x > st.peek()) {
                    mp[st.pop()] = x
                }
                st.push(x)
            }
        }

        while (st.isNotEmpty()) {
            mp[st.pop()] = -1
        }

        for (i in nums1.indices) {
            nums1[i] = mp.getValue(nums1[i])
        }

        return nums1
    }
}