package cc.learndata.leetcode
object MedianSortedArray extends App {
    def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int] ):Double = {  
        val mergeArray: Array[Int] = nums1 ++ nums2
        val mergeSortedArray = mergeArray.sortWith(_ < _)
        val mergeSortedArrayLength = mergeSortedArray.size

        val midLength = mergeSortedArrayLength / 2 - 1

        if (mergeSortedArrayLength % 2 == 1) {

            mergeSortedArray(midLength + 1) 
        }
        else {
            (mergeSortedArray(midLength) + mergeSortedArray(midLength + 1))/2.0 
        }
    }
}