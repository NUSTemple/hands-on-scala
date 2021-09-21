package cc.learndata.leetcode

object IntersectionOfTwoArraysII extends App {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    var res = Array[Int]()
    var flag = true
    val nums1_length = nums1.length
    val nums2_length = nums2.length
    val (nums1_sorted, nums2_sorted) = if (nums1_length < nums2_length) {
      (nums1.sorted, nums2.sorted)
    } else {
      (nums2.sorted, nums1.sorted)
    }

    var m = 0

    if (
      nums1_sorted(0) > nums2_sorted.last || nums1_sorted.last < nums2_sorted(0)
    ) {
      res = Array[Int]()
    } else {

      nums1_sorted.foreach(x => {

        flag = true
        while (m < nums2_sorted.length && x >= nums2_sorted(m) && flag) {

          if (x == nums2_sorted(m)) {
            res = res :+ x
            flag = false
          }
          m = m + 1
        }

      })
    }

    res
  }
}
