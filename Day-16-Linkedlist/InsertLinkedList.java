class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertLinkedList {
    Node head;

    // Insert at beginning
    public void insertBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertLinkedList list = new InsertLinkedList();
        list.insertBegin(10);
        list.insertBegin(5);
        list.insertEnd(20);
        list.display();
    }
}
