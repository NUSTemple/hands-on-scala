package cc.learndata.leetcode

object LetterCasePermutation extends App {

    def letterCasePermutation(s: String): List[String] = {

        val sa = s.toCharArray()

        def letterCasePermutation(sa: Array[Char], l: List[List[Char]]): List[List[Char]] = {
            if (sa.length == 0) return l
            if (sa(0).isLetter) {
                letterCasePermutation(sa.drop(1), l.map(x => x :+ sa(0).toLower) ++ l.map(x => x :+ sa(0).toUpper))
            }
            else letterCasePermutation(sa.drop(1), l.map(x => x :+ sa(0)))
            
        }
        
        letterCasePermutation(sa, List(List[Char]())).map(x => x.mkString(""))
    }
}
