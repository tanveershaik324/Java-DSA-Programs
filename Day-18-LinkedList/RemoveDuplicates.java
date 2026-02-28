public class RemoveDuplicates {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.head = list.new Node(1);
        list.head.next = list.new Node(1);
        list.head.next.next = list.new Node(2);
        list.head.next.next.next = list.new Node(3);
        list.head.next.next.next.next = list.new Node(3);

        list.removeDuplicates();
        list.printList();
    }
}
