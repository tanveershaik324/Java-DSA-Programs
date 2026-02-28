class CountNodes {
    Node root;

    int count(Node node) {
        if (node == null) return 0;

        return 1 + count(node.left) + count(node.right);
    }

    public static void main(String[] args) {
        CountNodes tree = new CountNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.println("Total Nodes: " + tree.count(tree.root));
    }
}
