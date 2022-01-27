package leetcode._2085

class Solution {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        val map1 = mutableMapOf<String, Int>()
        for (word in words1) {
            val count = map1[word]

            if (count == null) {
                map1[word] = 1
            } else {
                map1[word] = count + 1
            }
        }
        removeWordsBasedOnCount(map1)

        val map2 = mutableMapOf<String, Int>()
        for (word in words2) {
            val count = map2[word]

            if (count == null) {
                map2[word] = 1
            } else {
                map2[word] = count + 1
            }
        }
        removeWordsBasedOnCount(map2)

        var output = 0
        for (key in map1.keys) {
            if (map2.containsKey(key)) {
                output++
            }
        }

        return output
    }

    private fun removeWordsBasedOnCount(map: MutableMap<String, Int>) {
        val iterator = map.entries.iterator()

        while (iterator.hasNext()) {
            val entry = iterator.next()
            if (entry.value > 1) {
                iterator.remove()
            }
        }
    }
}