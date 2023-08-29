package leetcode._2798

class Solution {

    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var count = 0
        for (hour in hours) {
            if (hour >= target) {
                count++
            }
        }
        return count
    }
}