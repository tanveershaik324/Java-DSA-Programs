class BalancedTreeExample {

    boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    int checkHeight(Node root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        if (left == -1) return -1;

        int right = checkHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        BalancedTreeExample obj = new BalancedTreeExample();

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);

        System.out.println("Is Balanced: " + obj.isBalanced(root));
    }
}
