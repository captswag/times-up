package refresh._1299

class Solution {

    fun replaceElements(arr: IntArray): IntArray {
        var max = arr[arr.size - 1]

        for (index in arr.size - 2 downTo 0) {
            val temp = arr[index]
            arr[index] = max
            max = Math.max(max, temp)
        }

        arr[arr.size - 1] = -1
        return arr
    }
}