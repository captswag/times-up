package leetcode._2651

class Solution {

    fun findDelayedArrivalTime(arrivalTime: Int, delayedTime: Int): Int {
        return (arrivalTime + delayedTime) % 24
    }
}