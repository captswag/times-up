package leetcode._170

class TwoSum {

    val list = mutableListOf<Int>()

    fun add(number: Int) {
        list.add(number)
    }

    fun find(value: Int): Boolean {
        var output = false
        val set = mutableSetOf<Int>()

        for (num in list) {
            if (set.contains(num)) {
                output = true
                break
            } else {
                set.add(value - num)
            }
        }

        return output
    }

}