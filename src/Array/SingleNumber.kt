//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//Example 1:
//Input: nums = [2,2,1]
//Output: 1

fun singleNumber(nums: IntArray = intArrayOf(2, 2, 1)): Int {
    var solution = 0
    var count = 0
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] == nums[j]) {
                count++
            }
        }
        if (count == 1) {
            solution = nums[i]
            break
        } else count = 0

    }
    return solution

}
