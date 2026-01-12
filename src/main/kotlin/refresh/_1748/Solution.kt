package refresh._1748

class Solution {

    fun sumOfUnique(nums: IntArray): Int {
        val frequency = IntArray(101)

        for (num in nums) {
            frequency[num]++
        }

        var sum = 0
        for (i in 1 until frequency.size) {
            if (frequency[i] == 1) {
                sum += i
            }
        }

        return sum
    }
}