package cc.learndata.leetcode

object RomanToInteger extends App {
  def romanToInteger(s: String): Integer = {

    val romanIntMapping = Map(
      "I" -> 1,
      "V" -> 5,
      "X" -> 10,
      "L" -> 50,
      "C" -> 100,
      "D" -> 500,
      "M" -> 1000
    )

    val negMapping = List("IV", "IX", "XL", "XC", "CD", "CM")

    val sa = s.split("")
    val sLength = sa.size
    val saDrop1 = sa.drop(1) :+ ""
    var sum = 0
    var idx = 0

    while (idx < sLength) {
      val currentC = sa(idx)
      val nextC = saDrop1(idx)

      val d = currentC + nextC
      if (negMapping.contains(d)) {
        sum += -1 * romanIntMapping(currentC) + romanIntMapping(nextC)
        idx += 2
      } else {
        sum += romanIntMapping(currentC)
        idx += 1
      }
    }

    sum

  }
}
