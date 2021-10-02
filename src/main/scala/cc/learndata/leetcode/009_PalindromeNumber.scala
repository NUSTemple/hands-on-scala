package cc.learndata.leetcode

object PalindromeNumber extends App {
  def isPalindromeNumber(i: Integer): Boolean = {

    val sa = (i).toString().split("").reverse.mkString("")

    sa == (i.toString())

  }

    def isPalindromeNumberV2(i: Integer): Boolean = {

        def isPalindromeNumber(s: List[Char]): Boolean = {
    
    val res = s match {

        case h +: c :+ t => if (h != t) false else isPalindromeNumber(c)
        case h :: t => true
        case h +: Nil => true
        case Nil => true
    }

    res

    }

    val s = i.toString.toList
    val res = isPalindromeNumber (s)
    res
}
}
