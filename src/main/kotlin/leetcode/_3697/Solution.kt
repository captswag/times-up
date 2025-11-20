package leetcode._3697

class Solution {

    fun decimalRepresentation(n: Int): IntArray {
        var number = n
        var size = 0

        while (number != 0) {
            if (number % 10 != 0) {
                size++
            }
            number /= 10
        }

        val output = IntArray(size)
        var placeValue = 1
        number = n

        while (number != 0) {
            val mod = number % 10
            if (mod != 0) {
                output[--size] = mod * placeValue
            }
            placeValue *= 10
            number /= 10
        }

        return output
    }
}