package cc.learndata.leetcode

import org.scalatest.FunSuite

class SymmetricTreeTest extends FunSuite {

  // test 1
  test("test 1") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(2)
    val node4 = new TreeNode(3)
    val node5 = new TreeNode(4)
    val node6 = new TreeNode(4)
    val node7 = new TreeNode(3)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.left = node6
    node3.right = node7

    val testResult = SymmetricTree.isSymmetric(node1)

    val expectResult = true
    assert(testResult == expectResult)

  }

  // test 2
  test("test 2") {
    val node1 = new TreeNode(1)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(2)
    val node4 = new TreeNode(3)
    val node5 = new TreeNode(3)


    node1.left = node2
    node1.right = node3
    node2.right = node4
    node3.right = node5


    val testResult = SymmetricTree.isSymmetric(node1)

    val expectResult = false
    assert(testResult == expectResult)
  }

}
