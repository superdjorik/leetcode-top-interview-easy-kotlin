//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//Example 1:
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

fun rotate(nums: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7), k: Int = 3): Unit {

    for (i in 1..k) {
        val tKey = nums[nums.size - 1]
        for (i in nums.size - 1 downTo 1) {
            nums[i] = nums[i - 1]
        }
        nums[0] = tKey
    }

}


