package refresh._1437

class Solution {

    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var previousIndex = -1

        for (index in nums.indices) {
            if (nums[index] == 1) {
                if (previousIndex == -1) {
                    previousIndex = index
                } else {
                    val distance = index - previousIndex - 1
                    if (distance < k) {
                        return false
                    } else {
                        previousIndex = index
                    }
                }
            }
        }

        return true
    }
}