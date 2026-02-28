import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BoundaryTraversal {

    static List<Integer> result = new ArrayList<>();

    public static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public static void addLeftBoundary(TreeNode root) {
        TreeNode curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) result.add(curr.val);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    public static void addLeaves(TreeNode root) {
        if (root == null) return;
        if (isLeaf(root)) {
            result.add(root.val);
            return;
        }
        addLeaves(root.left);
        addLeaves(root.right);
    }

    public static void addRightBoundary(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        TreeNode curr = root.right;

        while (curr != null) {
            if (!isLeaf(curr)) stack.push(curr.val);
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
    }

    public static List<Integer> boundaryTraversal(TreeNode root) {
        if (root == null) return result;

        if (!isLeaf(root)) result.add(root.val);

        addLeftBoundary(root);
        addLeaves(root);
        addRightBoundary(root);

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(boundaryTraversal(root));
    }
}
