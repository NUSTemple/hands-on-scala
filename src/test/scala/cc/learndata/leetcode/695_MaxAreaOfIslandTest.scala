package cc.learndata.leetcode

import org.scalatest.FunSuite

class MaxAreaOfIslandTest extends FunSuite {
  test("test 1") {
    val grid = Array(
      Array(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
      Array(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
      Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
      Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
    )

    val testResult = MaxAreaOfIsland.maxAreaOfIsland(grid)
    val expectResult = 6
    assert(testResult == expectResult)
  }

  test("test 2") {
    val grid = Array(Array(0, 0, 0, 0, 0, 0, 0, 0))
    val testResult =
      MaxAreaOfIsland.maxAreaOfIsland(grid)
    val expectResult = 0
    assert(testResult == expectResult)
  }

    test("test 3") {
    val grid = Array(Array(1))
    val testResult =
      MaxAreaOfIsland.maxAreaOfIsland(grid)
    val expectResult = 1
    assert(testResult == expectResult)
  }

}
