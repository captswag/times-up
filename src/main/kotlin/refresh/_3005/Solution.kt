package refresh._3005

class Solution {

    fun maxFrequencyElements(nums: IntArray): Int {
        val freq = IntArray(101)
        var mx = 0

        for (num in nums) {
            freq[num]++
            if (freq[num] > mx) {
                mx = freq[num]
            }
        }

        var tot = 0

        for (f in freq) {
            if (f == mx) {
                tot += f
            }
        }

        return tot
    }
}