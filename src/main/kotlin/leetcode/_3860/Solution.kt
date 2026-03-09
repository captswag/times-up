package leetcode._3860

class Solution {

    fun uniqueEmailGroups(emails: Array<String>): Int {
        val st = mutableSetOf<String>()
        val sb = StringBuilder()

        for (s in emails) {
            var i = 0

            while (s[i] != '@') {
                if (s[i] == '.') {
                    i++
                } else if (s[i] == '+') {
                    while (s[i] != '@') {
                        i++
                    }
                } else {
                    sb.append(s[i++].lowercaseChar())
                }
            }

            sb.append(s[i++])

            while (i < s.length) {
                sb.append(s[i++].lowercaseChar())
            }

            st.add(sb.toString())
            sb.setLength(0)
        }

        return st.size
    }
}