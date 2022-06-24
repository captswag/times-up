package leetcode._1560

class Solution {
    fun mostVisited(n: Int, rounds: IntArray): List<Int> {
        val countArray = IntArray(n + 1)
        var index = 0
        countArray[rounds[index]]++ // Add index 0 position to array

        while (index + 1 < rounds.size) {
            var left = rounds[index]
            val right = rounds[index + 1]

            left++
            if (left - 1 < right) {
                while (left <= right) {
                    countArray[left]++
                    left++
                }
            } else {
                while (left <= n) {
                    countArray[left]++
                    left++
                }
                left = 1
                while (left <= right) {
                    countArray[left]++
                    left++
                }
            }

            index++
        }

        index = 0
        var maxCount = countArray[index++]

        while (index < countArray.size) {
            if (maxCount < countArray[index]) {
                maxCount = countArray[index]
            }
            index++
        }

        val output = mutableListOf<Int>()
        index = 0

        while (index < countArray.size) {
            if (countArray[index] == maxCount) {
                output.add(index)
            }
            index++
        }

        return output
    }
}