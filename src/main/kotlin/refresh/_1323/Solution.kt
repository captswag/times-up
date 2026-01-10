package refresh._1323

class Solution {

    fun maximum69Number(num: Int): Int {
        var number = num
        var index = 0
        var indexSix = -1

        while (number != 0) {
            if (number % 10 == 6) {
                indexSix = index
            }
            number /= 10
            index++
        }

        return if (indexSix != -1) {
            var placeValue = 3
            repeat(indexSix) {
                placeValue *= 10
            }
            num + placeValue
        } else {
            num
        }
    }
}