package cc.learndata.leetcode

object ContainDuplicates extends App {

  def containDuplicates(nums: Array[Int]): Boolean = {
    val numsSorted = nums.sorted
    val res = numsSorted match {

      case Array(h, n, _*) => if (h == n) true else containDuplicates(numsSorted.drop(1))
      case Array() | Array(_) => false
      case _           => false

    }

    res
 
  }

    def containDuplicatesV2(nums: Array[Int]): Boolean = {
    nums.length != nums.toSet.toArray.length
  }
}
