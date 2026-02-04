package refresh._2798

class Solution {

    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var cnt = 0

        for (hour in hours) {
            if (hour >= target) {
                cnt++
            }
        }

        return cnt
    }
}