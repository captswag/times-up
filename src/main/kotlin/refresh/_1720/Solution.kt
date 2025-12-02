package refresh._1720

class Solution {

    fun decode(encoded: IntArray, first: Int): IntArray {
        val arr = IntArray(encoded.size + 1)
        arr[0] = first

        for (index in 1 until arr.size) {
            arr[index] = arr[index - 1] xor encoded[index - 1]
        }

        return arr
    }
}