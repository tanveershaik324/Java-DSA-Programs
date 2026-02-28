class Node {
    int data;
    Node next, child;

    Node(int data) {
        this.data = data;
        next = child = null;
    }
}

class FlattenList {

    static Node flatten(Node head) {
        if (head == null) return head;

        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                Node temp = curr.child;

                // find tail of child
                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = curr.next;
                curr.next = curr.child;
                curr.child = null;
            }
            curr = curr.next;
        }
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.child = new Node(3);

        head = flatten(head);
        printList(head);
    }
}
