package cc.learndata.leetcode

import org.scalatest.FunSuite

class BinaryTreeInorderTraversalTest extends FunSuite {

  // test 1
  test("test 1") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(3)

    node1.right = node2
    node2.left = node3

    val testResult = BinaryTreeInorderTraversal.inorderTraversal(node1)

    val expectResult = List(1, 3, 2)
    assert(testResult == expectResult)

  }

  // test 2
  test("test 2") {
    val node1 = null

    val testResult = BinaryTreeInorderTraversal.inorderTraversal(node1)

    val expectResult = List()
    assert(testResult == expectResult)
  }

  test("test 3") {
    val node1 = new TreeNode(1)

    val testResult = BinaryTreeInorderTraversal.inorderTraversal(node1)

    val expectResult = List(1)
    assert(testResult == expectResult)
  }

  // test 4
  test("test 4") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)

    node1.left = node2

    val testResult = BinaryTreeInorderTraversal.inorderTraversal(node1)

    val expectResult = List(2, 1)
    assert(testResult == expectResult)

  }

  // test 5
  test("test 5") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)

    node1.right = node2

    val testResult = BinaryTreeInorderTraversal.inorderTraversal(node1)

    val expectResult = List(1, 2)
    assert(testResult == expectResult)

  }

}
