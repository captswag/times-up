package refresh._941

class Solution {

    fun validMountainArray(arr: IntArray): Boolean {
        var index = 0
        while (index < arr.size - 1) {
            if (arr[index] >= arr[index + 1]) {
                break
            }
            index++
        }

        if (index == 0 || index == arr.size - 1) {
            return false
        }

        while (index < arr.size - 1) {
            if (arr[index] <= arr[index + 1]) {
                return false
            }
            index++
        }

        return index == arr.size - 1
    }
}