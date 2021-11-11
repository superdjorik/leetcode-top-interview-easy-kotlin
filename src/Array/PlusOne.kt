//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//
//Example 1:
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].

fun plusOne(digits: IntArray = intArrayOf(1, 2, 3)): IntArray {

    val digitList = digits.toMutableList()
    var reversed = mutableListOf<Int>()
    digitList[digitList.size - 1]++

    for (i in digitList.size - 1 downTo 0) {

        when {

            digitList[i] > 9 -> {
                when {
                    i > 0 -> {
                        digitList[i - 1]++
                        digitList[i] = digitList[i] % 10
                    }
                    else -> {
                        digitList.add(0)
                        digitList[0] = 1
                    }

                }
            }

        }
    }
    return digitList.toIntArray()
}