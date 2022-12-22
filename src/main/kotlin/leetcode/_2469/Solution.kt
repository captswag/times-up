package leetcode._2469

class Solution {

    fun convertTemperature(celsius: Double): DoubleArray {
        return doubleArrayOf(celsius + 273.15, (celsius * 1.80) + 32.00)
    }
}