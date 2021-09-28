package cc.learndata.leetcode

object BinaryTreeInorderTraversal extends App {

    def inorderTraversal(root: TreeNode): List[Int] = {
        // Inorder (Left, Root, Right)

        if (root == null) return List()

        inorderTraversal(root.left) ++ List(root.value) ++ inorderTraversal(root.right)   
    }
  
}
