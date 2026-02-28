import java.util.*;

class LevelOrder {
    Node root;

    void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.print("Level Order: ");
        tree.levelOrder(tree.root);
    }
}
