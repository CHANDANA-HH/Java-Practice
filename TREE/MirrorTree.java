
public class MirrorTree {

    // Tree Node
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    // Function to convert to mirror
    public static void mirror(Node root) {
        if (root == null) return;

        // swap children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recur for subtrees
        mirror(root.left);
        mirror(root.right);
    }

    // Inorder traversal (to check result)
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

  
    public static void main(String[] args) {

        // Original Tree
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Before Mirror (Inorder): ");
        inorder(root);

        mirror(root);

        System.out.print("\nAfter Mirror (Inorder): ");
        inorder(root);
    }
}
