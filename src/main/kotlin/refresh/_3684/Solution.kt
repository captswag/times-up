package refresh._3684

import java.util.*

class Solution {

    fun maxKDistinct(nums: IntArray, k: Int): IntArray {
        val set = TreeSet<Int> { a, b -> b - a }

        for (num in nums) {
            set.add(num)
        }

        val size = Math.min(set.size, k)
        val distinct = IntArray(size)

        var index = 0
        for (num in set) {
            distinct[index++] = num
            if (index == size) {
                break
            }
        }

        return distinct
    }
}