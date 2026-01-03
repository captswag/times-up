package refresh._1427

class Solution {

    fun stringShift(s: String, shift: Array<IntArray>): String {
        var shifts = 0

        for (s in shift) {
            if (s[0] == 0) {
                shifts -= s[1]
            } else {
                shifts += s[1]
            }
        }

        val res = CharArray(s.length)
        for (index in s.indices) {
            res[shiftedIndex(index, shifts, s.length)] = s[index]
        }

        return String(res)
    }

    private fun shiftedIndex(index: Int, shifts: Int, length: Int): Int {
        return if (shifts < 0) {
            (index + (shifts % length) + length) % length
        } else {
            (index + shifts) % length
        }
    }
}