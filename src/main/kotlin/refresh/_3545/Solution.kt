package refresh._3545

class Solution {

    fun minDeletion(s: String, k: Int): Int {
        val frequency = IntArray(26)
        var distinct = 0

        for (c in s) {
            frequency[c - 'a']++
            if (frequency[c - 'a'] == 1) {
                distinct++
            }
        }

        var deletions = 0
        while (distinct > k) {
            var minIndex = -1
            var minValue = Int.MAX_VALUE

            for (index in frequency.indices) {
                if (frequency[index] != 0 && frequency[index] < minValue) {
                    minValue = frequency[index]
                    minIndex = index
                }
            }

            deletions += frequency[minIndex]
            frequency[minIndex] = 0
            distinct--
        }

        return deletions
    }
}