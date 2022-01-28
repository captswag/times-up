package leetcode._884

class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val map1 = mapWordsWithTheirCount(s1)
        val map2 = mapWordsWithTheirCount(s2)
        val list = mutableListOf<String>()

        for (key in map1.keys) {
            val count = map1[key]
            if (count != null && count == 1) {
                // Check if map2 contains this particular word key
                if (!map2.containsKey(key)) {
                    list.add(key)
                }
            }
        }

        for (key in map2.keys) {
            val count = map2[key]
            if (count != null && count == 1) {
                // Check if map1 contains this particular word key
                if (!map1.containsKey(key)) {
                    list.add(key)
                }
            }
        }

        return list.toTypedArray()
    }

    private fun mapWordsWithTheirCount(s: String): Map<String, Int> {
        val sb = StringBuilder()
        val map = mutableMapOf<String, Int>()

        var index = 0
        while (index <= s.length) {
            if (index == s.length || s[index] == ' ') {
                // Add to HashMap
                val word = sb.toString()
                val count = map[word]
                if (count == null) {
                    map[word] = 1
                } else {
                    map[word] = count + 1
                }
                sb.clear()
                index++
            } else {
                sb.append(s[index])
                index++
            }
        }

        return map
    }
}