package refresh._303

class NumArray(nums: IntArray) {

    var number = nums

    init {
        for (index in 1 until number.size) {
            number[index] = number[index] + number[index - 1]
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        return if (left == 0) {
            number[right]
        } else {
            number[right] - number[left - 1]
        }
    }
}