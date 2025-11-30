package leetcode._3678

class Solution {

    fun smallestAbsent(nums: IntArray): Int {
        val set = BooleanArray(102)
        var sum = 0

        for (num in nums) {
            sum += num
            if (num > 0) {
                set[num] = true
            }
        }

        val avg = sum / nums.size
        var smallestAbsent = if (avg < 0) {
            1
        } else {
            avg + 1
        }

        while (set[smallestAbsent]) {
            smallestAbsent++
        }

        return smallestAbsent
    }
}