//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true

fun containsDuplicate(nums: IntArray = intArrayOf(1, 2, 3, 1)): Boolean {
    val tempNums = nums.toList().distinct()
    return tempNums.size != nums.size
}
