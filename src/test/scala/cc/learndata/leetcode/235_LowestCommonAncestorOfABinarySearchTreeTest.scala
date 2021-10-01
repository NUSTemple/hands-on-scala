package cc.learndata.leetcode

import org.scalatest.FunSuite

class LowestCommonAncestorOfABinarySearchTreeTest extends FunSuite{
  
        // test 1
  test("test 1") {
    val node1 = new TreeNode(6)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(8)
    val node4 = new TreeNode(0)
    val node5 = new TreeNode(4)
    val node6 = new TreeNode(7)
    val node7 = new TreeNode(9)
    val node8 = new TreeNode(3)
    val node9 = new TreeNode(5)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.left = node6
    node3.right = node7
    node5.left = node8
    node5.right = node9

    val testResult = LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(node1, node2, node3)

    val expectResult = node1
    assert(testResult === expectResult)
}

        // test 2
  test("test 2") {
    val node1 = new TreeNode(6)
    val node2 = new TreeNode(2)
    val node3 = new TreeNode(8)
    val node4 = new TreeNode(0)
    val node5 = new TreeNode(4)
    val node6 = new TreeNode(7)
    val node7 = new TreeNode(9)
    val node8 = new TreeNode(3)
    val node9 = new TreeNode(5)

    node1.left = node2
    node1.right = node3
    node2.left = node4
    node2.right = node5
    node3.left = node6
    node3.right = node7
    node5.left = node8
    node5.right = node9

    val testResult = LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(node1, node2, node5)

    val expectResult = node2
    assert(testResult === expectResult)
}



}
