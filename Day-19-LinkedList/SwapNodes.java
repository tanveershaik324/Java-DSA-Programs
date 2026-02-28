class SwapNodes {
    static Node swap(Node head, int x, int y) {
        if (x == y) return head;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) return head;

        if (prevX != null) prevX.next = currY;
        else head = currY;

        if (prevY != null) prevY.next = currX;
        else head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

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

        head = swap(head, 2, 4);
        print(head);
    }
}
