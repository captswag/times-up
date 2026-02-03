package refresh._2652

class Solution {

    fun sumOfMultiples(n: Int): Int {
        var sum = 0

        for (x in 1..n) {
            if (x % 3 == 0 || x % 5 == 0 || x % 7 == 0) {
                sum += x
            }
        }

        return sum
    }
}