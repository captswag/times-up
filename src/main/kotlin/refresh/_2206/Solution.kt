package refresh._2206

class Solution {

    fun divideArray(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            if (set.contains(num)) {
                set.remove(num)
            } else {
                set.add(num)
            }
        }

        return set.size == 0
    }
}