package leetcode._3591

class Solution {

    fun checkPrimeFrequency(nums: IntArray): Boolean {
        val primes =
            setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

        val frequency = IntArray(101)

        for (num in nums) {
            frequency[num]++
        }

        var output = false
        for (f in frequency) {
            if (f in primes) {
                output = true
                break
            }
        }

        return output
    }
}