public class NthFromEnd {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    int getNthFromEnd(int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) return -1;
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public static void main(String[] args) {
        NthFromEnd list = new NthFromEnd();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);

        System.out.println("Nth from End: " + list.getNthFromEnd(2));
    }
}
