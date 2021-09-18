package cc.learndata.leetcode

object BinarySearch extends App {

  def binarySearch(nums: Array[Int], target: Int): Int = {

    var start = 0
    var end = nums.length - 1
    var res = -1
    var i = (start + end) / 2
    var flag = true

    if (flag && nums(start) == target) {
      res = start
      flag = false
    }

    if (flag && nums(end) == target) {
      res = end
      flag = false
    }

    while (start <= end && flag == true) {
      if (start == end || start >= i || end <= i) {
        flag = false
      }

      if (nums(i) == target) {
        res = i
        flag = false
      } else if (nums(i) > target) {
        end = i
        i = i - (end - start) / 2
      } else {
        start = i
        i = i + (end - start) / 2
      }

    }

    res
  }

}
