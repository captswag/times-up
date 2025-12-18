package refresh._860

class Solution {

    fun lemonadeChange(bills: IntArray): Boolean {
        var fives = 0
        var tens = 0

        for (bill in bills) {
            when (bill) {
                5 -> fives++
                10 -> {
                    if (fives > 0) {
                        fives--
                        tens++
                    } else {
                        return false
                    }
                }
                20 -> {
                    if (fives > 0 && tens > 0) {
                        fives--
                        tens--
                    } else if (fives > 2) {
                        fives -= 3
                    } else {
                        return false
                    }
                }
            }
        }

        return true
    }
}