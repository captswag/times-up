package leetcode._3079

class Solution {

    fun sumOfEncryptedInt(nums: IntArray): Int {
        var output = 0

        for (num in nums) {
            output += encrypt(num)
        }

        return output
    }

    private fun encrypt(num: Int): Int {
        var number = num
        var max = 0
        var length = 0

        while (number != 0) {
            max = Math.max(max, number % 10)
            number /= 10
            length++
        }

        var encryptedNumber = 0
        var placeValue = 1

        while (length > 0) {
            encryptedNumber += (max * placeValue)
            placeValue *= 10
            length--
        }

        return encryptedNumber
    }
}