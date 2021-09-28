package cc.learndata.leetcode

object PhoneLetterCombinations extends App {
    def letterCombinations(digits:String): List[String] = {

        val phoneNumberLetterMapping = Map(
            '2' -> "abc",
            '3' -> "def",
            '4' -> "ghi",
            '5' -> "jkl",
            '6' -> "mno",
            '7' -> "pqrs",
            '8' -> "tuv",
            '9' -> "wxyz"
        )

        val sa = digits.toCharArray()        
        val saLength = sa.length()

        def letterCombinations(s: Array[Char], l: List[List[Char]]): List[List[Char]] ={

            if (s.length == 0) return l

            val c = s(0)
            val cl = phoneNumberLetterMapping(c).toCharArray()


            cl.flatMap(y => letterCombinations(s.drop(1), l.map(x => x :+ y))).toList

        }

        if (sa.length > 0 ) letterCombinations(sa, List(List[Char]())).map(x => x.mkString("")) else List()
    }
}