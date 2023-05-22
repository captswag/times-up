package leetcode._929

class Solution {

    fun numUniqueEmails(emails: Array<String>): Int {
        val output = mutableSetOf<String>()

        for (email in emails) {
            var add = true
            var atTheRateFound = false
            val sb = StringBuilder()
            for (c in email) {
                if (atTheRateFound) {
                    sb.append(c)
                } else if (c == '.') {
                    continue
                } else if (c == '@') {
                    sb.append(c)
                    atTheRateFound = true
                } else if (c == '+') {
                    add = false
                } else {
                    if (add) {
                        sb.append(c)
                    }
                }
            }
            output.add(String(sb))
        }

        return output.size
    }
}