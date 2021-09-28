package cc.learndata.leetcode

import org.scalatest.FunSuite

class BinaryTreePreorderTraversalTest extends FunSuite {

  // test 1
  test("test 1") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(3)

    node1.right = node2
    node2.left = node3

    val testResult = BinaryTreePreorderTraversal.preorderTraversal(node1)

    val expectResult = List(1,2,3)
    assert(testResult == expectResult)

  }

  // test 2
  test("test 2") {
    val node1 = null

    val testResult = BinaryTreePreorderTraversal.preorderTraversal(node1)

    val expectResult = List()
    assert(testResult == expectResult)
  }

    test("test 3") {
    val node1 = new TreeNode(1)

    val testResult = BinaryTreePreorderTraversal.preorderTraversal(node1)

    val expectResult = List(1)
    assert(testResult == expectResult)
  }


}
