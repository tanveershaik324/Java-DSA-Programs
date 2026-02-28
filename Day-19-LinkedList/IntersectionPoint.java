class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class IntersectionPoint {
    static Node getIntersection(Node head1, Node head2) {
        Node a = head1, b = head2;

        while (a != b) {
            a = (a == null) ? head2 : a.next;
            b = (b == null) ? head1 : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10);

        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = common;

        Node head2 = new Node(4);
        head2.next = common;

        Node result = getIntersection(head1, head2);
        System.out.println("Intersection Point: " + result.data);
    }
}
