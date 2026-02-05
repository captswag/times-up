package refresh._2960

class Solution {

    fun countTestedDevices(batteryPercentages: IntArray): Int {
        var cnt = 0

        for (b in batteryPercentages) {
            if (b - cnt > 0) {
                cnt++
            }
        }

        return cnt
    }
}