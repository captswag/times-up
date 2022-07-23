package leetcode._1460

class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        val arrCount = IntArray(1000)

        for (num in arr) {
            arrCount[num - 1]++
        }

        var output = true
        for (num in target) {
            arrCount[num - 1]--
            if (arrCount[num - 1] == -1) {
                output = false
                break
            }
        }

        for (num in arrCount) {
            if (num > 0) {
                output = false
                break
            }
        }

        return output
    }
}