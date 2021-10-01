package cc.learndata.leetcode

object ValidateBinarySearchTree extends App {

    def isValidBST(root: TreeNode): Boolean = {

    (inorderTraversal(root) == inorderTraversal(root).sorted ) && (inorderTraversal(root).length == inorderTraversal(root).toSet.toList.length)}

    def inorderTraversal(rt: TreeNode): List[Int] = {
        // Inorder (Left, Root, Right)

        if (rt == null) return List()

        inorderTraversal(rt.left) ++ List(rt.value) ++ inorderTraversal(rt.right)   
    }

}