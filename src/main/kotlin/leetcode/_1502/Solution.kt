package leetcode._1502

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        var max = arr[0]
        var min = arr[0]

        for (index in 1 until arr.size) {
            if (arr[index] > max) {
                max = arr[index]
            }
            if (arr[index] < min) {
                min = arr[index]
            }
        }

        val rem = (max - min) % (arr.size - 1)
        if (rem == 0) {
            val step = (max - min) / (arr.size - 1)
            if (step == 0) {
                return true
            } else {
                var output = true
                val set = mutableSetOf<Int>()
                for (num in arr) {
                    if ((num - min) % step != 0) {
                        output = false
                        break
                    }
                    if (set.contains(num)) {
                        output = false
                        break
                    } else {
                        set.add(num)
                    }
                }
                return output
            }
        } else {
            return false
        }
    }
}