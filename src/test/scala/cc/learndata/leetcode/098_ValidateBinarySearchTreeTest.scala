package cc.learndata.leetcode

import org.scalatest.FunSuite

class ValidateBinarySearchTreeTest extends FunSuite {

  // test 1
  test("test 1") {
    val node1 = new TreeNode(2)
    val node2 = new TreeNode(1)
    val node3 = new TreeNode(3)

    node1.left = node2
    node1.right = node3

    val testResult = ValidateBinarySearchTree.isValidBST(node1)

    val expectResult = true
    assert(testResult == expectResult)
}

  // test 2
  test("test 2") {
    val node1 = new TreeNode(5)
    val node2 = new TreeNode(1)
    val node3 = new TreeNode(4)
    val node4 = new TreeNode(3)
    val node5 = new TreeNode(6)


    node1.left = node2
    node1.right = node3
    node3.left = node4
    node3.right = node5


    val testResult = ValidateBinarySearchTree.isValidBST(node1)

    val expectResult = false
    assert(testResult == expectResult)

  }


    // test 3
  test("test 3") {
    val node1 = new TreeNode(5)
    val node2 = new TreeNode(4)
    val node3 = new TreeNode(6)
    val node4 = new TreeNode(3)
    val node5 = new TreeNode(7)


    node1.left = node2
    node1.right = node3
    node3.left = node4
    node3.right = node5


    val testResult = ValidateBinarySearchTree.isValidBST(node1)

    val expectResult = false
    assert(testResult == expectResult)

  }


    // test 4
  test("test 4") {
    val node1 = new TreeNode(32)
    val node2 = new TreeNode(26)
    val node3 = new TreeNode(47)
    val node4 = new TreeNode(19)
    val node5 = new TreeNode(56)
    val node6 = new TreeNode(27)


    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = null

    node3.left = null
    node3.right = node5
    node4.right = node6


    val testResult = ValidateBinarySearchTree.isValidBST(node1)

    val expectResult = false
    assert(testResult == expectResult)

  }

}