class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Diameter {

    static int res = 0;   // this will store the diameter

    public static int height(TreeNode root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        // update diameter
        res = Math.max(res, lh + rh + 1);

        // return height
        return 1 + Math.max(lh, rh);
    }

    public static int diameter(TreeNode root) {
        res = 0;          // reset before calculation
        height(root);
        return res;
    }

   
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int dia = diameter(root);
        System.out.println("Diameter of the tree = " + dia);
    }
}
