package cc.learndata.leetcode

object PalindromeNumber extends App {
  def isPalindromeNumber(i: Integer): Boolean = {

    val sa = (i).toString().split("").reverse.mkString("")

    sa == (i.toString())

  }
}
