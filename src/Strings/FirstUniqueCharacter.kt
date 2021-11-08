//Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.
//
//
//
//Example 1:
//
//Input: s = "leetcode"
//Output: 0
//Example 2:
//
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//
//Input: s = "aabb"
//Output: -1
//
//
//Constraints:
//
//1 <= s.length <= 105
//s consists of only lowercase English letters.

fun firstUniqChar(s: String = "aavbb"): Int {
    var someInt = 0
    var count = 0
    val countArray: MutableList<Int> = mutableListOf()
    for (element in s) {
        for (i in s) {
            if (element == i) {
                count++
                if (count > 2) break
            }
        }
        countArray.add(count)
        count = 0
    }
    for (elem in countArray) {
        if (elem == 1) {
            someInt = countArray.indexOf(elem)
            break
        } else someInt = -1
    }
    return someInt
}
