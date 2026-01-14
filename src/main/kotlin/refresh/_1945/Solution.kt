package refresh._1945

class Solution {

    fun getLucky(s: String, k: Int): Int {
        var sumOfDigits = 0

        for (c in s) {
            sumOfDigits += calculateSumOfDigits((c - 'a') + 1)
        }

        var kCount = 1
        while (kCount < k) {
            sumOfDigits = calculateSumOfDigits(sumOfDigits)
            kCount++
        }

        return sumOfDigits
    }

    private fun calculateSumOfDigits(num: Int): Int {
        var number = num
        var sumOfDigits = 0

        while (number != 0) {
            sumOfDigits += (number % 10)
            number /= 10
        }

        return sumOfDigits
    }
}