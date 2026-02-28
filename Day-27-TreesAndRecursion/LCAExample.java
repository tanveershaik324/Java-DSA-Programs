class LCAExample {

    Node LCA(Node root, int n1, int n2) {
        if (root == null) return null;

        // If either node matches root
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);

        // If both sides return non-null
        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        LCAExample obj = new LCAExample();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node lca = obj.LCA(root, 4, 5);
        System.out.println("LCA: " + lca.data);
    }
}
