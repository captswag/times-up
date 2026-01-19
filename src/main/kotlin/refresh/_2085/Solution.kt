package refresh._2085

class Solution {

    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        val map1 = mutableMapOf<String, Int>()

        for (word in words1) {
            map1[word] = map1.getOrDefault(word, 0) + 1
        }

        val map2 = mutableMapOf<String, Int>()
        for (word in words2) {
            map2[word] = map2.getOrDefault(word, 0) + 1
        }

        var count = 0
        for (key in map1.keys) {
            if (map2.containsKey(key)) {
                if (map1.getValue(key) == 1 && map2.getValue(key) == 1) {
                    count++
                }
            }
        }

        return count
    }
}