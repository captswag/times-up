package refresh._2154

class Solution {

    fun findFinalValue(nums: IntArray, original: Int): Int {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            set.add(num)
        }

        var o = original
        while (o in set) {
            o *= 2
        }

        return o
    }
}