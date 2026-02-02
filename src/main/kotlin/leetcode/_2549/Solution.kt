package leetcode._2549

class Solution {

    fun distinctIntegers(n: Int): Int {
        return if (n == 1) {
            1
        } else {
            n - 1
        }
    }
}