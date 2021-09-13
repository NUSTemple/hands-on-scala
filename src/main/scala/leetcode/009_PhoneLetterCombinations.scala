package cc.learndata.leetcode

object PhoneLetterCombinations extends App {
    def letterCombinations(s:String): List[String] = {

        val phoneNumberLetterMapping = Map(
            "2" -> "abc",
            "3" -> "def",
            "4" -> "ghi",
            "5" -> "jkl",
            "6" -> "mno",
            "7" -> "pqrs",
            "8" -> "tuv",
            "9" -> "wxyz"
        )
        val saLength = s.length()
        val sa = s.split("").map(phoneNumberLetterMapping.getOrElse(_, "").split(""))
        

        println(sa.mkString(","))

        List("ab")
    }



}