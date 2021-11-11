//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]

fun intersect(nums1: IntArray = intArrayOf(3,1,2), nums2: IntArray = intArrayOf(1,1)): IntArray {
    val intersected = mutableListOf<Int>()
    var maxArr = mutableListOf<Int>()
    var minArr = mutableListOf<Int>()

    if (nums1.size > nums2.size) {
        maxArr = nums1.toMutableList()
        minArr = nums2.toMutableList()
    }
        else {
        maxArr = nums2.toMutableList()
        minArr = nums1.toMutableList()
    }
    minArr.forEach {
        if(maxArr.contains(it)){
            intersected.add(it)
            maxArr.remove(it)
        }
    }
    return intersected.toIntArray()
}
