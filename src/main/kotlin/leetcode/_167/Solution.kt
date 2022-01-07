package leetcode._167

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var startIndex = 0
        var endIndex = numbers.size - 1
        val nums = IntArray(2)

        while (startIndex < endIndex) {
            val sum = numbers[startIndex] + numbers[endIndex]
            if (sum == target) {
                nums[0] = startIndex + 1
                nums[1] = endIndex + 1
                break
            } else if (sum > target) {
                endIndex--
            } else {
                startIndex++
            }
        }

        return nums
    }
}