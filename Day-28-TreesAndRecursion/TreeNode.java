class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MirrorTree {

    public static TreeNode mirror(TreeNode root) {
        if (root == null) return null;

        TreeNode left = mirror(root.left);
        TreeNode right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.print("Original: ");
        inorder(root);

        mirror(root);

        System.out.print("\nMirror: ");
        inorder(root);
    }
}
