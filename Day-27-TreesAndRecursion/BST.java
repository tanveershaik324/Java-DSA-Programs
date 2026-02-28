class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BST {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 10);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 15);

        System.out.println(tree.search(tree.root, 5)); // true
    }
}
