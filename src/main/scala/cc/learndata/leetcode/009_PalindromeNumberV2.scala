package cc.learndata.leetcode

object PalindromeNumberV2 extends App {
  def isPalindromeNumber(i: Integer): Boolean = {

    val s = i.toString.toList
    val res = isPalindromeNumber (s)
    res
}

    def isPalindromeNumber(s: List[Char]): Boolean = {
    
    val res = s match {

        case h +: c :+ t => if (h != t) false else isPalindromeNumber(c)
        case h :: t => true
        case h +: Nil => true
        case Nil => true
    }

    res

    }

}