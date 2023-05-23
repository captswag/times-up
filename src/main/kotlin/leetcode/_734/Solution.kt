package leetcode._734

class Solution {

    fun areSentencesSimilar(
        sentence1: Array<String>, sentence2: Array<String>, similarPairs: List<List<String>>
    ): Boolean {
        var output = true

        if (sentence1.size == sentence2.size) {
            val similarPairsMap = mutableMapOf<String, MutableSet<String>>()
            for (pair in similarPairs) {
                var wordsSet = similarPairsMap.getOrDefault(pair[0], mutableSetOf())
                wordsSet.add(pair[1])
                similarPairsMap[pair[0]] = wordsSet

                wordsSet = similarPairsMap.getOrDefault(pair[1], mutableSetOf())
                wordsSet.add(pair[0])
                similarPairsMap[pair[1]] = wordsSet
            }

            for (index in sentence1.indices) {
                if (sentence1[index] == sentence2[index]) {
                    continue
                } else if (sentence2[index] in similarPairsMap.getOrDefault(sentence1[index], mutableSetOf())) {
                    continue
                } else {
                    output = false
                    break
                }
            }
        } else {
            output = false
        }

        return output
    }
}