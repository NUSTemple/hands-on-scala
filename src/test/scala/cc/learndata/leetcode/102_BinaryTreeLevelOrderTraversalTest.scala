package cc.learndata.leetcode

import org.scalatest.FunSuite

class BinaryTreeLevelOrderTraversalTest extends FunSuite {

  // test 1
  test("test 1") {
    val node1 = new TreeNode(3)
    val node2 = new TreeNode(9)
    val node3 = new TreeNode(20)
    val node4 = new TreeNode(15)
    val node5 = new TreeNode(7)
    
    node1.left = node2
    node1.right = node3
    node3.left = node4
    node3.right = node5

    val testResult = BinaryTreeLevelOrderTraversal.levelOrder(node1)

    val expectResult = List(List(3), List(9, 20), List(15, 7))
    assert(testResult.toSet == expectResult.toSet)

  }

    // test 2
  test("test 2") {
    val node1 = new TreeNode(1)

    val testResult = BinaryTreeLevelOrderTraversal.levelOrder(node1)

    val expectResult = List(List(1))
    assert(testResult == expectResult)

  }

      // test 3
  test("test 3") {
    val node1 = null

    val testResult = BinaryTreeLevelOrderTraversal.levelOrder(node1)

    val expectResult = null
    assert(testResult == expectResult)

  }
}
