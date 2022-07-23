package leetcode._1441

class Solution {
    fun buildArray(target: IntArray, n: Int): List<String> {
        var targetIndex = 0
        val output = mutableListOf<String>()

        for (value in 1..n) {
            if (value == target[targetIndex]) {
                output.add("Push")
                targetIndex++
            } else {
                output.add("Push")
                output.add("Pop")
            }
            if (targetIndex == target.size) {
                break
            }
        }

        return output
    }
}