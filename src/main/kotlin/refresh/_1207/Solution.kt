package refresh._1207

class Solution {

    fun uniqueOccurrences(arr: IntArray): Boolean {
        val frequency = IntArray(2001)

        for (num in arr) {
            frequency[num + 1000]++
        }

        val set = mutableSetOf<Int>()
        for (f in frequency) {
            if (f != 0) {
                if (set.contains(f)) {
                    return false
                } else {
                    set.add(f)
                }
            }
        }

        return true
    }
}