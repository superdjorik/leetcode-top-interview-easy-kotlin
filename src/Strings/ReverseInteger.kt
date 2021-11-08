//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//Example 1:
//Input: x = 123
//Output: 321
//
//Example 2:
//Input: x = -123
//Output: -321
//
// Example 3:
//Input: x = 120
//Output: 21
//
// Example 4:
//Input: x = 0
//Output: 0
//
//Constraints:
//-231 <= x <= 231 - 1

//      Solution:
import java.lang.Math.pow

fun reverse(x: Int): Int {
    if (x > pow(-2.0, 31.0) && x < pow(2.0, 31.0) - 1) {
        var str = x.toString()
        var strMinus: String

        if (str[0] == '0') {
            str.removeRange(0, 0)
            str = str.reversed()
        }
        if (str[0] == '-') {
            strMinus = str.substringAfter('-').toString()
            str = str[0] + strMinus.reversed()
        } else str = str.reversed()

        if (str.toLong() <= -2147483648 || str.toLong() >= 2147483647) {
            return 0
        } else return str.toInt()
    } else return 0

}