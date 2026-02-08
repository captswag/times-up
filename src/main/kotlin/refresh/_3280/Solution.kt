package refresh._3280

class Solution {

    fun convertDateToBinary(date: String): String {
        val ans = StringBuilder()

        ans.append(toBinaryRev(((date[8] - '0') * 10) + (date[9] - '0')))
        ans.append('-')
        ans.append(toBinaryRev(((date[5] - '0') * 10) + (date[6] - '0')))
        ans.append('-')
        ans.append(toBinaryRev(((date[0] - '0') * 1000) + ((date[1] - '0') * 100) + ((date[2] - '0') * 10) + (date[3] - '0')))

        return ans.reverse().toString()
    }

    private fun toBinaryRev(num: Int): String {
        val sb = StringBuilder()
        var x = num

        while (x != 0) {
            sb.append(x % 2)
            x /= 2
        }

        return sb.toString()
    }
}