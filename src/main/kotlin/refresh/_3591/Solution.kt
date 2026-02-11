package refresh._3591

class Solution {

    fun checkPrimeFrequency(nums: IntArray): Boolean {
        val primes =
            setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

        val freq = IntArray(101)
        for (num in nums) {
            freq[num]++
        }

        for (f in freq) {
            if (f in primes) {
                return true
            }
        }

        return false
    }
}