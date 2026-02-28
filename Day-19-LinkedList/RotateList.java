class RotateList {
    static Node rotate(Node head, int k) {
        if (head == null) return null;

        Node curr = head;
        int count = 1;

        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }

        if (curr == null) return head;

        Node kthNode = curr;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;
        head = kthNode.next;
        kthNode.next = null;

        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = rotate(head, 2);
        print(head);
    }
}
