package leetcode._821

class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val nums = IntArray(s.length)

        var bIndex: Int? = null
        var aIndex: Int? = null
        var cIndex = 0

        while (cIndex <= s.length) {
            if (cIndex == s.length && bIndex != null) {
                fillAfter(nums, bIndex)
            } else {
                if (s[cIndex] == c) {
                    if (bIndex == null) {
                        // Fill every index prior to this with the distance
                        bIndex = cIndex
                        fillBefore(nums, bIndex)
                    } else {
                        // Fill every index in between beforeIndex and afterIndex
                        aIndex = cIndex
                        fillInBetween(nums, bIndex, aIndex)
                        // Once filled, reset beforeIndex and afterIndex
                        bIndex = aIndex
                        aIndex = null
                    }
                }
            }
            cIndex++
        }
        return nums
    }

    private fun fillBefore(nums: IntArray, index: Int) {
        var nIndex = 0
        while (nIndex < index) {
            nums[nIndex] = index - nIndex
            nIndex++
        }
    }

    private fun fillAfter(nums: IntArray, index: Int) {
        var nIndex = nums.size - 1 // Fill backwards till the index
        while (nIndex > index) {
            nums[nIndex] = nIndex - index
            nIndex--
        }
    }

    private fun fillInBetween(nums: IntArray, bIndex: Int, aIndex: Int) {
        var nIndex = bIndex + 1
        while (nIndex < aIndex) {
            nums[nIndex] = Math.min(aIndex - nIndex, nIndex - bIndex)
            nIndex++
        }
    }
}