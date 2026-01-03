package refresh._1346

class Solution {

    fun checkIfExist(arr: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        for (num in arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true
            }
            set.add(num)
        }

        return false
    }
}