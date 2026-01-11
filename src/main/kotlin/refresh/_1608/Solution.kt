package refresh._1608

class Solution {

    fun specialArray(nums: IntArray): Int {
        val frequency = IntArray(1001)

        for (num in nums) {
            frequency[num]++
        }

        for (i in frequency.size - 2 downTo 0) {
            frequency[i] = frequency[i] + frequency[i + 1]
        }

        for (i in frequency.indices) {
            if (i == frequency[i]) {
                return i
            }
        }

        return -1
    }
}