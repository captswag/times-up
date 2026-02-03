package refresh._2678

class Solution {

    fun countSeniors(details: Array<String>): Int {
        var cnt = 0

        for (detail in details) {
            val age = ((detail[11] - '0') * 10) + (detail[12] - '0')
            if (age > 60) {
                cnt++
            }
        }

        return cnt
    }
}