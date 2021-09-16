package cc.learndata.leetcode
object IntegerToRoman extends App {

  def integerToRoman(i: Integer): String = {
    val intRomanMapping = Map(
      1000 -> "M",
      900 -> "CM",
      500 -> "D",
      400 -> "CD",
      100 -> "C",
      90 -> "XC",
      50 -> "L",
      40 -> "XL",
      10 -> "X",
      9 -> "IX",
      5 -> "V",
      4 -> "IV",
      1 -> "I"
    )
    val intComponentList = intRomanMapping.keys.toList.filter(_ <= i).sortWith(_ > _)
    println(intComponentList.mkString(","))
    integerToRoman(i, "", intComponentList)
  }

  def integerToRoman(
      i: Integer,
      currentString: String,
      intComponentLeftover: List[Int]
  ): String = {
    val intRomanMapping = Map(
      1000 -> "M",
      900 -> "CM",
      500 -> "D",
      400 -> "CD",
      100 -> "C",
      90 -> "XC",
      50 -> "L",
      40 -> "XL",
      10 -> "X",
      9 -> "IX",
      5 -> "V",
      4 -> "IV",
      1 -> "I"
    )

    if (i > 0) {
      val intComponent = intComponentLeftover(0)
      val n = i / intComponent
      val iLeftover = i - intComponent * n

      val currentString2 =
        currentString + intRomanMapping.getOrElse(intComponent, "") * n
      val intComponentLeftover2 = intComponentLeftover.drop(1)
      println(iLeftover)
      println(currentString2)
      println(intComponentLeftover2)
      integerToRoman(iLeftover, currentString2, intComponentLeftover2)
    } else {
      currentString
    }

  }

}
