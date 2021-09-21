package cc.learndata.leetcode

import org.scalatest.FunSuite

class ValidSudokuTest extends FunSuite {

  // test 1
  test("test 1") {
    val testResult =
      ValidSudoku.isValidSudoku(Array(Array('5','3','.','.','7','.','.','.','.')
                                ,Array('6','.','.','1','9','5','.','.','.')
                                ,Array('.','9','8','.','.','.','.','6','.')
                                ,Array('8','.','.','.','6','.','.','.','3')
                                ,Array('4','.','.','8','.','3','.','.','1')
                                ,Array('7','.','.','.','2','.','.','.','6')
                                ,Array('.','6','.','.','.','.','2','8','.')
                                ,Array('.','.','.','4','1','9','.','.','5')
                                ,Array('.','.','.','.','8','.','.','7','9')))
    val expectResult = true
    assert(testResult == expectResult)

  }


    // test 2
  test("test 2") {
    val testResult =
      ValidSudoku.isValidSudoku(Array(Array('8','3','.','.','7','.','.','.','.')
                                ,Array('6','.','.','1','9','5','.','.','.')
                                ,Array('.','9','8','.','.','.','.','6','.')
                                ,Array('8','.','.','.','6','.','.','.','3')
                                ,Array('4','.','.','8','.','3','.','.','1')
                                ,Array('7','.','.','.','2','.','.','.','6')
                                ,Array('.','6','.','.','.','.','2','8','.')
                                ,Array('.','.','.','4','1','9','.','.','5')
                                ,Array('.','.','.','.','8','.','.','7','9')))
    val expectResult = false
    assert(testResult == expectResult)

  }
}