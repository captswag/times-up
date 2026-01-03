package refresh._929

class Solution {

    fun numUniqueEmails(emails: Array<String>): Int {
        val res = mutableSetOf<String>()
        val sb = StringBuilder()

        for (email in emails) {
            var isDomainName = false
            var skipRestOfLocalName = false
            for (c in email) {
                when {
                    c == '@' -> {
                        sb.append(c)
                        isDomainName = true
                    }
                    c == '.' -> if (isDomainName) {
                        sb.append(c)
                    }
                    c == '+' -> if (isDomainName) {
                        sb.append(c)
                    } else {
                        skipRestOfLocalName = true
                    }
                    c.isLetter() -> {
                        if (isDomainName) {
                            sb.append(c)
                        } else if (!skipRestOfLocalName) {
                            sb.append(c)
                        }
                    }
                }
            }
            res.add(sb.toString())
            sb.setLength(0)
        }

        return res.size
    }
}