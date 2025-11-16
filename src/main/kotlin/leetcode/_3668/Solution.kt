package leetcode._3668

class Solution {

    fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
        val friendsSet = mutableSetOf<Int>()
        for (friend in friends) {
            friendsSet.add(friend)
        }

        val output = IntArray(friends.size)
        var index = 0

        for (o in order) {
            if (friendsSet.contains(o)) {
                output[index++] = o
            }
        }

        return output
    }
}