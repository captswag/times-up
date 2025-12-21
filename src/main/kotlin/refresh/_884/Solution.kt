package refresh._884

class Solution {

    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val map = mutableMapOf<String, Int>()
        val sb = StringBuilder()
        var index = 0

        while (index < s1.length) {
            while (index < s1.length && s1[index] != ' ') {
                sb.append(s1[index++])
            }
            map[sb.toString()] = map.getOrDefault(sb.toString(), 0) + 1
            sb.setLength(0)
            index++
        }

        index = 0
        while (index < s2.length) {
            while (index < s2.length && s2[index] != ' ') {
                sb.append(s2[index++])
            }
            map[sb.toString()] = map.getOrDefault(sb.toString(), 0) + 1
            sb.setLength(0)
            index++
        }

        val ans = mutableListOf<String>()
        for (key in map.keys) {
            if (map.getValue(key) == 1) {
                ans.add(key)
            }
        }

        return ans.toTypedArray()
    }
}