package cc.learndata.leetcode

object MaximumSubarray extends App {

  def maximumSubarray(nums: Array[Int]): Int = {

     // start with first positive int
    // add right, when hit first next postive int, if sum > 0, keep, if sum < 0, reset and put new positive int as start
    var tmp_sum = 0
    var tmp_max_sum = nums(0)
    var tmp_subarray = Array[Int]()
    var tmp_max_subarray = Array[Int](nums(0))

    for (idx <- nums.indices) {
        println(tmp_sum, tmp_max_sum, tmp_subarray.mkString(":"), tmp_max_subarray.mkString(":"))
      if (nums(idx) < 0) {
        tmp_sum = tmp_sum + nums(idx)
        tmp_subarray = tmp_subarray :+ nums(idx)
        if (nums(idx) > tmp_max_sum) {
            tmp_max_subarray = Array(nums(idx))
            tmp_max_sum = nums(idx)
          }


      } else {
        if (tmp_sum > 0) {
          tmp_subarray = tmp_subarray :+ nums(idx)
          tmp_sum = tmp_sum + nums(idx)
          if (tmp_sum > tmp_max_sum) {
            tmp_max_subarray = tmp_subarray
            tmp_max_sum = tmp_sum
          }
        } else {
          tmp_sum = nums(idx)
          tmp_subarray = Array(nums(idx))
          if (tmp_sum > tmp_max_sum) {
            tmp_max_subarray = tmp_subarray
            tmp_max_sum = tmp_sum
          }

        }

      }

    }

    tmp_max_subarray.sum
  }
}
