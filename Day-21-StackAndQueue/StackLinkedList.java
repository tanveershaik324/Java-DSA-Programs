class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class StackLinkedList {
    Node top;

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Underflow");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.display();
    }
}
