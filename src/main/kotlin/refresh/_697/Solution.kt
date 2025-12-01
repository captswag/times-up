package refresh._697

class Solution {

    fun findShortestSubArray(nums: IntArray): Int {
        val frequency = mutableMapOf<Int, Int>()
        var maxFrequency = 1

        for (num in nums) {
            val f = frequency.getOrDefault(num, 0) + 1
            frequency[num] = f
            if (f > maxFrequency) {
                maxFrequency = f
            }
        }

        return if (maxFrequency == 1) {
            1
        } else {
            var minLength = Int.MAX_VALUE
            for (key in frequency.keys) {
                if (frequency.getValue(key) == maxFrequency) {
                    var first = 0
                    while (nums[first] != key) {
                        first++
                    }

                    var last = nums.size - 1
                    while (nums[last] != key) {
                        last--
                    }

                    val currLength = last - first + 1
                    if (currLength < minLength) {
                        minLength = currLength
                    }
                }
            }

            minLength
        }
    }
}