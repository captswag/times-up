package refresh._599

class Solution {

    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val map1 = mutableMapOf<String, Int>()

        for (index in list1.indices) {
            map1[list1[index]] = index
        }

        var minIndexSum = Integer.MAX_VALUE
        val res = mutableListOf<String>()

        for (index in list2.indices) {
            if (list2[index] in map1.keys) {
                val currIndexSum = map1.getValue(list2[index]) + index
                if (currIndexSum == minIndexSum) {
                    res.add(list2[index])
                } else if (currIndexSum < minIndexSum) {
                    res.clear()
                    res.add(list2[index])
                    minIndexSum = currIndexSum
                }
            }
        }

        return res.toTypedArray()
    }
}