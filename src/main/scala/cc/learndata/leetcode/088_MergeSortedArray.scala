package cc.learndata.leetcode

object MergeSortedArray extends App {
  def mergeSortedArray(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var i = 0
    nums2.foreach( x => {

        nums1(i+m) = nums2(i)
        i += 1

    })
    scala.util.Sorting.quickSort(nums1)
  }
}