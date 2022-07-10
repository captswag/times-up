package leetcode._941

class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        var index = 0
        while (index + 1 < arr.size && arr[index] < arr[index + 1]) {
            index++
        }

        if (index == 0 || index == arr.size - 1) {
            return false
        }

        while (index + 1 < arr.size && arr[index] > arr[index + 1]) {
            index++
        }

        return index == arr.size - 1
    }
}