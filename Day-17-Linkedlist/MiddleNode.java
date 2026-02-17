class MiddleNode {
    Node head;

    void findMiddle() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle: " + slow.data);
    }

    public static void main(String[] args) {
        MiddleNode list = new MiddleNode();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        list.findMiddle();
    }
}
