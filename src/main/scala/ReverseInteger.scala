package cc.learndata.leetcode

object ReverseInteger extends App {
  def reverseInteger(i: Integer): Integer = {
    try {
      if (i < 0) {
        (-i).toString().split("").reverse.mkString("").toInt * (-1)
      } else {
        (i).toString().split("").reverse.mkString("").toInt
      }
    }
    catch {
        case _: Exception => 0
    }
  }
}
