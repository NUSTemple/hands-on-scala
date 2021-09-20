package cc.learndata.leetcode

object TwoSumII extends App {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {

    var start = 0
    var end = numbers.length - 1
    var res = Array[Int]()
    var flag = true
    if (numbers(start) + numbers(end) != target) {
      while (start < end && flag) {
        if (numbers(start) + numbers(end) == target) {
          res = Array(start + 1, end + 1)
          flag = false
        } else if (numbers(start) + numbers(end) > target) {
          end = end - 1
        } else {
          start = start + 1
        }

      }
    } else {
      res = Array(start + 1, end + 1)
      flag = false
    }

    res
  }
}
