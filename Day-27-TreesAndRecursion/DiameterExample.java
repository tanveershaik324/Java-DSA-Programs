class DiameterExample {
    int diameter = 0;

    int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Update diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    int getDiameter(Node root) {
        height(root);
        return diameter;
    }

    public static void main(String[] args) {
        DiameterExample obj = new DiameterExample();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        System.out.println("Diameter: " + obj.getDiameter(root));
    }
}
