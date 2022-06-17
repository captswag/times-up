package leetcode._1436

class Solution {
    fun destCity(paths: List<List<String>>): String {
        val set = mutableSetOf<String>()
        for (path in paths) {
            set.add(path[0])
        }

        var output = ""
        for (path in paths) {
            if (!set.contains(path[1])) {
                output = path[1]
                break
            }
        }
        return output
    }
}