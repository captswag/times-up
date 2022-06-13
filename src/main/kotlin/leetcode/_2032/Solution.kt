package leetcode._2032

class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val map = mutableMapOf<Int, Int>()
        val set = mutableSetOf<Int>()

        for (num in nums1) {
            if (!set.contains(num)) {
                map[num] = 1
            }
            set.add(num)
        }
        set.clear()

        for (num in nums2) {
            if (!set.contains(num)) {
                val count = map[num]
                if (count == null) {
                    map[num] = 1
                } else {
                    map[num] = count + 1
                }
            }
            set.add(num)
        }
        set.clear()

        for (num in nums3) {
            if (!set.contains(num)) {
                val count = map[num]
                if (count == null) {
                    map[num] = 1
                } else {
                    map[num] = count + 1
                }
            }
            set.add(num)
        }
        set.clear()

        val output = mutableListOf<Int>()
        for (key in map.keys) {
            val count = map[key]
            if (count != null && count > 1) {
                output.add(key)
            }
        }

        return output
    }
}