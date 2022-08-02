package leetcode._1854

class Solution {
    fun maximumPopulation(logs: Array<IntArray>): Int {
        val countArray = IntArray(101)

        for (log in logs) {
            countArray[log[0] - 1950]++
            countArray[log[1] - 1950]--
        }

        var index = 0
        var maxCount = countArray[index]
        var maxIndex = index++

        while (index < countArray.size) {
            countArray[index] = countArray[index] + countArray[index - 1]
            if (countArray[index] > maxCount) {
                maxCount = countArray[index]
                maxIndex = index
            }
            index++
        }

        return maxIndex + 1950
    }
}