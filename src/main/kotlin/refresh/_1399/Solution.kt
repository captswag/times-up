package refresh._1399

class Solution {

    fun countLargestGroup(n: Int): Int {
        var maxSumOfDigitsGroup = 1
        val map = mutableMapOf<Int, Int>()

        for (num in 1..n) {
            var number = num
            var sumOfDigits = 0

            while (number != 0) {
                sumOfDigits += (number % 10)
                number /= 10
            }

            map[sumOfDigits] = map.getOrDefault(sumOfDigits, 0) + 1
            if (map.getValue(sumOfDigits) > maxSumOfDigitsGroup) {
                maxSumOfDigitsGroup = map.getValue(sumOfDigits)
            }
        }

        var count = 0
        for (key in map.keys) {
            if (map.getValue(key) == maxSumOfDigitsGroup) {
                count++
            }
        }

        return count
    }
}