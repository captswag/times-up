package leetcode._2610

class Solution {

    fun findMatrix(nums: IntArray): List<List<Int>> {
        val countArray = IntArray(200)

        for (num in nums) {
            countArray[num - 1]++
        }

        val output = mutableListOf<List<Int>>()
        var count = nums.size
        while (count > 0) {
            val row = mutableListOf<Int>()
            for (index in countArray.indices) {
                if (countArray[index] > 0) {
                    row.add(index + 1)
                    countArray[index]--
                    count--
                }
            }
            output.add(row)
        }

        return output
    }
}