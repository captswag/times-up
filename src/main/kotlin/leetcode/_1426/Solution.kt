package leetcode._1426

class Solution {
    fun countElements(arr: IntArray): Int {
        val set = mutableSetOf<Int>()

        for (integer in arr) {
            set.add(integer)
        }

        var output = 0
        for (integer in arr) {
            if (set.contains(integer + 1)) {
                output++
            }
        }

        return output
    }
}