package refresh._2437

class Solution {

    fun countTime(time: String): Int {
        var cnt = 1

        if (time[0] == '?') {
            cnt *= if (time[1] == '?') {
                3
            } else if (time[1] - '0' > 3) {
                2
            } else {
                3
            }
        }

        if (time[1] == '?') {
            cnt *= if (time[0] == '?') {
                8
            } else if (time[0] - '0' < 2) {
                10
            } else {
                4
            }
        }

        if (time[3] == '?') {
            cnt *= 6
        }

        if (time[4] == '?') {
            cnt *= 10
        }

        return cnt
    }
}