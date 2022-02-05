package leetcode._1196

class Solution {
    fun maxNumberOfApples(weight: IntArray): Int {
        weight.sort()

        var output = 0
        var currentWeight = 0
        for (index in weight.indices) {
            if (currentWeight + weight[index] <= 5000) {
                output++
                currentWeight += weight[index]
            }
        }

        return output
    }
}