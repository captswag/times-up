package leetcode._2437

class Solution {

    fun countTime(time: String): Int {
        var clockTimes = 1

        for (index in time.indices) {
            if (time[index] == '?') {
                when (index) {
                    0 -> {
                        clockTimes *= if (time[1] == '?') {
                            3
                        } else {
                            if (Character.getNumericValue(time[1]) > 3) {
                                2
                            } else {
                                3
                            }
                        }
                    }
                    1 -> {
                        clockTimes *= if (time[0] == '?') {
                            8
                        } else {
                            if (Character.getNumericValue(time[0]) == 2) {
                                4
                            } else {
                                10
                            }
                        }
                    }
                    3 -> {
                        clockTimes *= 6
                    }
                    4 -> {
                        clockTimes *= 10
                    }
                }
            }
        }

        return clockTimes
    }
}