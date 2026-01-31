package refresh._2413

class Solution {

    fun smallestEvenMultiple(n: Int): Int {
        return if (n and 1 == 0) {
            n
        } else {
            n * 2
        }
    }
}