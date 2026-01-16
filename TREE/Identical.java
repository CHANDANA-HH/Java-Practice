public class Identical {

    // Our own Tree Node class
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    // Function to check if two trees are identical
    public static boolean isIdentical(Node r1, Node r2) {

        if (r1 == null && r2 == null)
            return true;

        if (r1 == null || r2 == null)
            return false;

        if (r1.data != r2.data)
            return false;

        return isIdentical(r1.left, r2.left) &&
               isIdentical(r1.right, r2.right);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Tree 1
        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);

        // Tree 2
        Node r2 = new Node(1);
        r2.left = new Node(2);
        r2.right = new Node(3);

        // Check
        boolean result = isIdentical(r1, r2);

        if (result)
            System.out.println("Trees are IDENTICAL");
        else
            System.out.println("Trees are NOT identical");
    }
}
