package refresh._734

class Solution {

    fun areSentencesSimilar(
        sentence1: Array<String>,
        sentence2: Array<String>,
        similarPairs: List<List<String>>
    ): Boolean {
        if (sentence1.size == sentence2.size) {
            val map = mutableMapOf<String, MutableSet<String>>()

            for (similarPair in similarPairs) {
                if (map.containsKey(similarPair[0])) {
                    val set = map.getValue(similarPair[0])
                    set.add(similarPair[1])
                } else {
                    map[similarPair[0]] = mutableSetOf(similarPair[1])
                }

                if (map.containsKey(similarPair[1])) {
                    val set = map.getValue(similarPair[1])
                    set.add(similarPair[0])
                } else {
                    map[similarPair[1]] = mutableSetOf(similarPair[0])
                }
            }

            for (index in sentence1.indices) {
                if (sentence1[index] == sentence2[index]) {
                    continue
                } else if (map.containsKey(sentence1[index])) {
                    val set = map.getValue(sentence1[index])
                    if (sentence2[index] !in set) {
                        return false
                    }
                } else {
                    return false
                }
            }

            return true
        } else {
            return false
        }
    }
}