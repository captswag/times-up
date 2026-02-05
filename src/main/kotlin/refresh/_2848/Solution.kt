package refresh._2848

class Solution {

    fun numberOfPoints(nums: List<List<Int>>): Int {
        val seen = BooleanArray(101)
        var cnt = 0

        for (num in nums) {
            for (i in num[0]..num[1]) {
                if (!seen[i]) {
                    seen[i] = true
                    cnt++
                }
            }
        }

        return cnt
    }
}