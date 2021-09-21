package cc.learndata.leetcode

object ContainDuplicatesV2 extends App {

  def containDuplicates(nums: Array[Int]): Boolean = {
    nums.length != nums.toSet.toArray.length
  }
}
