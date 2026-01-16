// package TREE;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class InorderTraversal {

    // Recursive function
    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);          // Visit left subtree
        System.out.print(root.val + " ");  // Visit root
        inorder(root.right);         // Visit right subtree
    }

    public static void main(String[] args) {
        // Example tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder traversal:");
        inorder(root); // Output: 4 2 5 1 3
    }
}
