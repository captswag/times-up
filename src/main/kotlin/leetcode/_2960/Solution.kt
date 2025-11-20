package leetcode._2960

class Solution {

    fun countTestedDevices(batteryPercentages: IntArray): Int {
        var output = 0

        for (batteryPercentage in batteryPercentages) {
            val newBatteryPercentage = batteryPercentage - output
            if (newBatteryPercentage > 0) {
                output++
            } else {
                continue
            }
        }

        return output
    }
}