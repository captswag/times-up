package refresh._2006

class Solution {

    fun countKDifference(nums: IntArray, k: Int): Int {
        val frequency = IntArray(101)

        for (num in nums) {
            frequency[num]++
        }

        var count = 0
        for (num in nums) {
            frequency[num]--
            val num1 = num - k
            val num2 = num + k
            if (num1 in 1..100) {
                count += frequency[num1]
            }
            if (num2 in 1..100) {
                count += frequency[num2]
            }
        }

        return count
    }
}