package refresh._1550

class Solution {

    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var oddCount = 0

        for (num in arr) {
            if (num and 1 == 1) {
                oddCount++
                if (oddCount == 3) {
                    return true
                }
            } else {
                oddCount = 0
            }
        }

        return false
    }
}