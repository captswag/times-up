package leetcode._3894

class Solution {

    fun trafficSignal(timer: Int): String {
        return if (timer == 0) {
            "Green"
        } else if (timer == 30) {
            "Orange"
        } else if (timer in 31..90) {
            "Red"
        } else {
            "Invalid"
        }
    }
}