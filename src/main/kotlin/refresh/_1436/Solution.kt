package refresh._1436

class Solution {

    fun destCity(paths: List<List<String>>): String {
        val set = mutableSetOf<String>()

        for (p in paths) {
            set.add(p[0])
        }

        for (p in paths) {
            if (p[1] !in set) {
                return p[1]
            }
        }

        return ""
    }
}