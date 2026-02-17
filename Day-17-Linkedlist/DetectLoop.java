class DetectLoop {
    Node head;

    boolean hasLoop() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        // Creating loop
        list.head.next.next.next = list.head;

        System.out.println("Loop Found: " + list.hasLoop());
    }
}
