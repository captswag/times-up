package refresh._2169

class Solution {

    fun countOperations(num1: Int, num2: Int): Int {
        var number1 = num1
        var number2 = num2

        var count = 0
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 -= number2
            } else {
                number2 -= number1
            }
            count++
        }

        return count
    }
}