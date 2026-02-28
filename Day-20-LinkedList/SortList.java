class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class SortList {

    static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        right = mergeSort(right);

        return merge(left, right);
    }

    static Node getMid(Node head) {
        Node slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node temp = dummy;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        if (a != null) temp.next = a;
        if (b != null) temp.next = b;

        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        head = mergeSort(head);
        print(head);
    }
}
