package cc.learndata.leetcode

import org.scalatest.FunSuite

class PathSumTest extends FunSuite {
  // test 1
  test("test 1") {
    val node1 = new TreeNode(5)
    val node2 = new TreeNode(4)
    val node3 = new TreeNode(8)
    val node4 = new TreeNode(11)
    val node5 = new TreeNode(13)
    val node6 = new TreeNode(4)
    val node7 = new TreeNode(7)
    val node8 = new TreeNode(2)
    val node9 = new TreeNode(1)
    node1.left = node2
    node1.right = node3
    node2.left = node4
    node4.left = node7
    node4.right = node8
    node3.left = node5
    node3.right = node6
    node6.right = node9
    val testResult = PathSum.hasPathSum(node1, 22)

    val expectResult = true
    assert(testResult == expectResult)

  }

  // test 2
  test("test 2") {

    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(3)
    node1.left = node2
    node1.right = node3

    val testResult = PathSum.hasPathSum(node1, 5)

    val expectResult = false
    assert(testResult == expectResult)
  }

    test("test 3") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    node1.left = node2

    val testResult = PathSum.hasPathSum(node1, 0)

    val expectResult = false
    assert(testResult == expectResult)
  }

      test("test 4") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    node1.left = node2

    val testResult = PathSum.hasPathSum(node1, 1)

    val expectResult = false
    assert(testResult == expectResult)
  }
}
