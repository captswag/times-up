package refresh._3678

class Solution {

    fun smallestAbsent(nums: IntArray): Int {
        var sum = 0
        val seen = BooleanArray(102)

        for (num in nums) {
            sum += num
            if (num > 0) {
                seen[num] = true
            }
        }

        var ans = if (sum < 0) {
            1
        } else {
            (sum / nums.size) + 1
        }

        while (seen[ans]) {
            ans++
        }

        return ans
    }
}