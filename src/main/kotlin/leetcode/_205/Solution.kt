package leetcode._205

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        var output = true

        //  The problem is basically no one should have one to many mapping
        if (s.length == t.length) {
            val sMap = mutableMapOf<Char, Char>()
            val tMap = mutableMapOf<Char, Char>()

            for (index in s.indices) {
                val sChar = s[index]
                val tChar = t[index]

                val sCharMap = sMap[sChar]
                val tCharMap = tMap[tChar]

                if (sCharMap != null) {
                    // This means the character at s already has a mapping, now the question is the mapping correct?
                    if (sCharMap != tChar) {
                        output = false
                        break
                    }
                } else {
                    sMap[sChar] = tChar
                }
                if (tCharMap != null) {
                    if (tCharMap != sChar) {
                        output = false
                        break
                    }
                } else {
                    tMap[tChar] = sChar
                }
            }
        } else {
            output = false
        }

        return output
    }
}