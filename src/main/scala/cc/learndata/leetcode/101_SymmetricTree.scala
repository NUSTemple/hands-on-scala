package cc.learndata.leetcode

object SymmetricTree extends App {

    def isSymmetric(root: TreeNode): Boolean = {   

        def isSymmetricEqual(n1:TreeNode, n2:TreeNode):Boolean = {

            if (n1 == null && n2 == null) return true
            if (n1 != null && n2 == null) return false
            if (n1 == null && n2 != null) return false

            n1.value == n2.value && isSymmetricEqual(n1.right, n2.left) && isSymmetricEqual(n1.left, n2.right)
        }

        isSymmetricEqual(root.left, root.right)
    }
}