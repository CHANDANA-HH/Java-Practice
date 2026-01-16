public class LCA {

  
    static class TreeNode {
        int key;
        TreeNode left, right;

        TreeNode(int k) {
            key = k;
            left = right = null;
        }
    }

    public static TreeNode lca(TreeNode root, int n1, int n2) {

        if (root == null)
            return null;

        if (root.key == n1 || root.key == n2)
            return root;

        TreeNode lca1 = lca(root.left, n1, n2);
        TreeNode lca2 = lca(root.right, n1, n2);

        if (lca1 != null && lca2 != null)
            return root;

        if (lca1 != null)
            return lca1;

        return lca2;
    }


    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int n1 = 4, n2 = 5;

        TreeNode ans = lca(root, n1, n2);

        if (ans != null)
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + ans.key);
        else
            System.out.println("LCA not found");
    }
}
