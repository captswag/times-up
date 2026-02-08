package refresh._3300

class Solution {

    fun minElement(nums: IntArray): Int {
        var mn = 36

        for (num in nums) {
            var x = num
            var sum = 0

            while (x != 0) {
                sum += (x % 10)
                x /= 10
            }

            if (sum < mn) {
                mn = sum
            }
        }

        return mn
    }
}