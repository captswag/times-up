package refresh._1426

class Solution {

    fun countElements(arr: IntArray): Int {
        val set = mutableSetOf<Int>()

        for (num in arr) {
            set.add(num)
        }

        var count = 0
        for (num in arr) {
            if (set.contains(num + 1)) {
                count++
            }
        }

        return count
    }
}