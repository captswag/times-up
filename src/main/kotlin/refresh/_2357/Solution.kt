package refresh._2357

class Solution {

    fun minimumOperations(nums: IntArray): Int {
        val frequency = IntArray(101)

        var operations = 0
        for (num in nums) {
            frequency[num]++
            if (num != 0 && frequency[num] == 1) {
                operations++
            }
        }

        return operations
    }
}