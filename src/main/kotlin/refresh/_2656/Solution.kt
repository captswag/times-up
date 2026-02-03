package refresh._2656

class Solution {

    fun maximizeSum(nums: IntArray, k: Int): Int {
        var i = 0
        var max = nums[i]
        i++

        while (i < nums.size) {
            if (nums[i] > max) {
                max = nums[i]
            }
            i++
        }

        var k = k
        var sum = 0

        while (k > 0) {
            sum += max
            max++
            k--
        }

        return sum
    }
}