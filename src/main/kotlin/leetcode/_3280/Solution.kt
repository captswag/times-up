package leetcode._3280

class Solution {

    fun convertDateToBinary(date: String): String {
        val binaryDate = StringBuilder()

        binaryDate.append(toBinary(toInt(date, 8, 9)))
        binaryDate.append('-')
        binaryDate.append(toBinary(toInt(date, 5, 6)))
        binaryDate.append('-')
        binaryDate.append(toBinary(toInt(date, 0, 3)))

        return binaryDate.reverse().toString()
    }

    private fun toBinary(n: Int): StringBuilder {
        var number = n
        val binary = StringBuilder()

        while (number != 0) {
            val mod = number % 2
            binary.append(mod)
            number /= 2
        }

        return binary
    }

    private fun toInt(date: String, left: Int, right: Int): Int {
        var i = 0
        var placeValue = 1

        for (index in right downTo left) {
            i += ((date[index] - '0') * placeValue)
            placeValue *= 10
        }

        return i
    }
}