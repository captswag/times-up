package leetcode._1346

class Solution {
    fun checkIfExists(arr: IntArray): Boolean {
        var output = false
        val set = mutableSetOf<Int>()
        var firstZero = true

        for (num in arr) {
            if (num == 0 && !firstZero) {
                set.add(num)
            } else if (num == 0 && firstZero) {
                firstZero = false
            } else {
                set.add(num)
            }
        }

        for (num in arr) {
            val double = num + num
            if (set.contains(double)) {
                output = true
                break
            }
        }

        return output
    }
}