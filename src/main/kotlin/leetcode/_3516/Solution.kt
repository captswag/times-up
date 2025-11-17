package leetcode._3516

class Solution {

    fun findClosest(x: Int, y: Int, z: Int): Int {
        val steps1 = Math.abs(x - z)
        val steps2 = Math.abs(y - z)

        return if (steps1 == steps2) {
            0
        } else if (steps1 < steps2) {
            1
        } else {
            2
        }
    }
}