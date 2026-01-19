package refresh._2089

class Solution {

    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        var equalCount = 0
        var lessCount = 0

        for (num in nums) {
            if (target == num) {
                equalCount++
            } else if (target > num) {
                lessCount++
            }
        }

        val res = mutableListOf<Int>()

        while (equalCount > 0) {
            res.add(lessCount++)
            equalCount--
        }

        return res
    }
}