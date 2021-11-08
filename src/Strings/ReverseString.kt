//Write a function that reverses a string. The input string is given as an array of characters s.
//
//
//Example 1:
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//
// Example 2:
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
//
//Constraints:
//1 <= s.length <= 105
//s[i] is a printable ascii character.

fun reverseString(s: CharArray): Unit {

    for(i in 0 .. s.size - 1){
        val last = s.size-i-1
        if(i >= last) {
            break
        }
        s[i] = s[last].also { s[last] = s[i] }
    }
}