package leetcode._231

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        /**
         * How does this even work
         * All the powers of 2, for eg
         * 1, 2, 4, 8, 16, 32, 64 are represented in binary as
         * 1, 10, 100, 1000, 10000, 100000
         * If n is any of the above digits, then the digits of n - 1 are
         * 0, 1, 3, 7, 15, 31, 63
         * Which are represented in binary as
         * 0, 1, 11, 111, 1111, 11111, 111111
         * We know 1 & 0 and 0 & 1 is 0
         * Hence we do n & n - 1 and the output should be 0 if n is a power of 2
         */
        return if (n < 0 || n == 0) {
            false
        } else {
            n and n - 1 == 0
        }
    }
}