class RemoveLoop {
    Node head;

    void removeLoop() {
        Node slow = head, fast = head;

        // Detect loop
        boolean loop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loop = true;
                break;
            }
        }

        if (loop) {
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        RemoveLoop list = new RemoveLoop();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        // Creating loop
        list.head.next.next.next = list.head;

        list.removeLoop();
        list.display();
    }
}
