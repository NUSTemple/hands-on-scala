package cc.learndata.leetcode
object IntegerToRoman extends App {

  val intRomanMapping = Map(
    1000 -> "M",
    900 -> "CM",
    500 -> "D",
    400 -> "C",
    90 -> "XC",
    50 -> "L",
    40 -> "XL",
    10 -> "X",
    9 -> "IX",
    5 -> "V",
    4 -> "IV",
    1 -> "I"
  )

  val intComponent = intRomanMapping.keys.toList.sortWith(_ > _)

  def integerToRoman(i: Integer): String = {
      integerToRoman(i, "", intComponent)
  }

  def integerToRoman(i:Integer, currentString: String, intComponentLeftover: List[Int]): String = {

    if ( i > 0 ) {

        currentString += ""
        intComponentLeftover
    } else {
        currentString
    }

  }

}
